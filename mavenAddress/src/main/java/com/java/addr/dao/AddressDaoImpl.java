package com.java.addr.dao;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.addr.dto.AddressDto;

@Component
public class AddressDaoImpl implements AddressDao {
	@Autowired
	private SqlSessionTemplate sqlSession;

	public int writeOk(AddressDto addressDto) {
		return sqlSession.insert("writeOk", addressDto);
	}

	public AddressDto selectOk(String name) {
		return sqlSession.selectOne("selectOk", name);
	}

	public int update(HashMap<String, Object> hMap) {
		// TODO Auto-generated method stub
		return sqlSession.update("update", hMap);
	}

	@Override
	public int deleteOk(String name) {
		return sqlSession.delete("deleteOk", name);
	}
}
