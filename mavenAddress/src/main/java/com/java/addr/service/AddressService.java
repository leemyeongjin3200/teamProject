package com.java.addr.service;

import org.springframework.web.servlet.ModelAndView;

public interface AddressService {
	public void writeOk(ModelAndView mav);
	public void selectOk(ModelAndView mav);
	public void update(ModelAndView mav);
	public void updateOk(ModelAndView mav);
	public void deleteOk(ModelAndView mav);
}
