package com.sharath.repo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.sharath.dto.MobileDto;

public class MobileRepoImpl implements MobileRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mobile");
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean saveAndSaveAll(MobileDto... dtos) {

		em.getTransaction().begin();
		if (em != null) {
			for (MobileDto dt : dtos) {
				em.persist(dt);
			}
			em.getTransaction().commit();
			System.out.println("saved successfully");
			return true;
		}

		return false;
	}

	@Override
	public List<MobileDto> readAll() {

		Query query = em.createNamedQuery("readAll");
		return query.getResultList();

	}

	@Override
	public List<MobileDto> readById(int... id) {

//		List<MobileDto> readById = readAll();
//		List<MobileDto> readByids = new ArrayList<MobileDto>();
//
//		for (int i : id) {
//			for (MobileDto d : readById) {
//				if (i == d.getid()) {
//					readByids.add(d);
//				}
//			}
//		}
//		
//			return readByids;

		Query query = em.createNamedQuery("readByid");
		List<MobileDto> li = new ArrayList<MobileDto>();
		for (int id1 : id) {
			query.setParameter("id", id1);
			li.add((MobileDto) query.getSingleResult());
		}

		return li;

	}

	@Override
	public List<MobileDto> readByRam(String ram) {

		Query query = em.createNamedQuery("readByRam");

		query.setParameter("ram", ram);

		return query.getResultList();

	}

	@Override
	public boolean updatePriceByNameAndRam(int price, String name, String ram) {

		em.getTransaction().begin();
		Query query = em.createNamedQuery("updatePrice");
		query.setParameter("price", price);
		query.setParameter("name", name);
		query.setParameter("ram", ram);
		query.executeUpdate();
		em.getTransaction().commit();

		return true;

	}

	@Override
	public boolean deleteName(String name) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("deleteByName");
		query.setParameter("name", name);
		query.executeUpdate();
		em.getTransaction().commit();

		return true;
	}

}
