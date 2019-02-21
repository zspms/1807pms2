package com.zs.test.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zs.pms.exception.AppException;
import com.zs.pms.po.TProduct;
import com.zs.pms.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationcontext.xml")
public class TestProduct {
	@Autowired
	ProductService ps;
	
	@Test
	public void testQuery() {
		ps.queryByAll();
		System.out.println("查询成功");
	}
	
	
}
