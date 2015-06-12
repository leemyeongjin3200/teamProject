package com.java.addr.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.java.addr.dto.AddressDto;
import com.java.addr.service.AddressService;

@Controller
public class AddressController{
	private Logger logger=Logger.getLogger(this.getClass().getName());
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping(value="/address/write.do", method=RequestMethod.GET)
	public String write(HttpServletRequest req, HttpServletResponse res){
		logger.info("write------------------");
		
		return "address/write";
	}
	
	@RequestMapping(value="/address/write.do", method=RequestMethod.POST)
	public ModelAndView write(HttpServletRequest req, HttpServletResponse res, AddressDto addressDto){
		logger.info("writeOk------------------");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("addressDto", addressDto);
		
		addressService.writeOk(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/address/select.do", method=RequestMethod.GET)
	public String select(HttpServletRequest req){
		logger.info("select------------------");
		
		return "address/select";
	}
	
	@RequestMapping(value="/address/select.do", method=RequestMethod.POST)
	public ModelAndView select(HttpServletRequest req, HttpServletResponse res){
		logger.info("selectOk------------------");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request", req);
		
		addressService.selectOk(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/address/update.do", method=RequestMethod.GET)
	public ModelAndView update(HttpServletRequest req){
		logger.info("update------------------");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request", req);
		
		addressService.update(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/address/update.do", method=RequestMethod.POST)
	public ModelAndView update(HttpServletRequest req, HttpServletResponse res, AddressDto addr){
		logger.info("updateOk------------------");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request", req);
		mav.addObject("addr", addr);
		addressService.updateOk(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/address/delete.do", method=RequestMethod.GET)
	public String delete(HttpServletRequest req){
		return "address/delete";
	}
	
	@RequestMapping(value="/address/deleteOk.do", method=RequestMethod.GET)
	public ModelAndView deleteOk(HttpServletRequest req, HttpServletResponse res){
		logger.info("deleteOk------------------");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request", req);
		
		addressService.deleteOk(mav);
		
		return mav;
	}
}
