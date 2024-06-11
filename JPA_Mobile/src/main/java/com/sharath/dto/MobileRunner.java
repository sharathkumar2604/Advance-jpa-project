package com.sharath.dto;

import com.sharath.repo.MobileRepo;
import com.sharath.repo.MobileRepoImpl;

public class MobileRunner {

	public static void main(String[] args) {
		
		
		MobileRepo repo= new MobileRepoImpl();
		
		MobileDto d1 = new MobileDto("Oppo","4gb","128gb", "Blue", 12990);
		MobileDto d2 = new MobileDto("Realme","4gb","128gb", "Blue", 12500);
		MobileDto d3 = new MobileDto("Vivo","4gb","128gb", "Blue", 12299);
		MobileDto d4 = new MobileDto("Realme","8gb","128gb", "Blue", 14000);
		MobileDto d5 = new MobileDto("Vivo","8gb","128gb", "Blue", 15499);
		MobileDto d6 = new MobileDto("Oppo","8gb","128gb", "Blue", 15990);
		MobileDto d7 = new MobileDto("Mi","4gb","128gb", "Blue", 11999);
		MobileDto d8 = new MobileDto("Mi","8gb","128gb", "Blue", 13699);
		MobileDto d9 = new MobileDto("Samsung","4gb","128gb", "Blue", 13500);
		MobileDto d10 = new MobileDto("Samsung","8gb","128gb", "Blue", 16990);
		
//		repo.saveAndSaveAll(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10);
		
		
//		for(MobileDto d :repo.readAll())
//		{
//			System.out.println(d);
//		}
		
//		System.out.println(repo.readById(2,4,5));
		
		
//		System.out.println(repo.readByRam("8gb"));
		
//		System.out.println(repo.updatePriceByNameAndRam(131231, "Samsung","8gb")?"updated sucessfully":"!mismatch not updated please check the entry");
	
		System.out.println(repo.deleteName("Samsung")?"deleted sucessfully":"!mismatch not deleted please check the entry");
		
	}

}
