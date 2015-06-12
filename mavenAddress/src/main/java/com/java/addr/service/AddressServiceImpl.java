package com.java.addr.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.java.addr.dao.AddressDao;
import com.java.addr.dto.AddressDto;

@Component
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressDao addressDao;

	public void writeOk(ModelAndView mav) {
		Map<String, Object> map=mav.getModelMap();
		AddressDto addressDto=(AddressDto)map.get("addressDto");
		
		int check=addressDao.writeOk(addressDto);
		
		mav.addObject("check", check);
		mav.setViewName("address/writeOk");
	}

	public void selectOk(ModelAndView mav) {
		Map<String, Object> map=mav.getModelMap();
		HttpServletRequest req=(HttpServletRequest)map.get("request");
		
		String name=req.getParameter("name");
		
		AddressDto addressDto=addressDao.selectOk(name);
		
		mav.addObject("addr", addressDto);
		mav.setViewName("address/selectOk");
	}

	public void update(ModelAndView mav) {
		Map<String, Object> map=mav.getModelMap();
		HttpServletRequest req=(HttpServletRequest)map.get("request");
		
		String name=req.getParameter("name");
		
		if(name != null){
			AddressDto addressDto=addressDao.selectOk(name);
			mav.addObject("addr", addressDto);
		}
		
		mav.setViewName("address/update");
	}

	public void updateOk(ModelAndView mav) {
		Map<String, Object> map=mav.getModelMap();
		HttpServletRequest req=(HttpServletRequest)map.get("request");
		AddressDto addr=(AddressDto)map.get("addr");
		
		int num=addr.getNum();
		String phone=addr.getPhone();
		String email=addr.getEmail();
		
		HashMap<String, Object> hMap=new HashMap<String, Object>();
		hMap.put("num", num);
		hMap.put("phone", phone);
		hMap.put("email", email);
		
		int check=addressDao.update(hMap);
		
		mav.addObject("check", check);
		mav.setViewName("address/update");
	}

	public void deleteOk(ModelAndView mav) {
		Map<String, Object> map=mav.getModelMap();
		HttpServletRequest req=(HttpServletRequest)map.get("request");
		
		String name=req.getParameter("name");
		
		int check=addressDao.deleteOk(name);
		mav.addObject("check", check);
		
		mav.setViewName("address/delete");
	}
}
