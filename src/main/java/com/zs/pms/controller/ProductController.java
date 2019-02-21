package com.zs.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zs.pms.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	@RequestMapping("/product/list.do")
	public String list(ModelMap map) {
		map.addAttribute("LIST",ps.queryByAll());
		return "product/list";
	}
	
	
}
