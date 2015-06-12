package com.java.addr.dao;

import java.util.HashMap;

import com.java.addr.dto.AddressDto;

public interface AddressDao {
	public int writeOk(AddressDto addressDto);
	public AddressDto selectOk(String name);
	public int update(HashMap<String, Object> hMap);
	public int deleteOk(String name);
}
