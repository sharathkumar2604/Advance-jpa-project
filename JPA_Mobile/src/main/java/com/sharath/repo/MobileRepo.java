package com.sharath.repo;

import java.util.List;

import com.sharath.dto.MobileDto;

public interface MobileRepo {
	
	public boolean saveAndSaveAll(MobileDto...dtos);
	
	public List<MobileDto> readAll();
	
	public List<MobileDto> readById(int...id);
	
	public List<MobileDto> readByRam(String ram);
	
	public boolean updatePriceByNameAndRam(int price,String name,String ram);
	
	public boolean deleteName(String name);
	

}
