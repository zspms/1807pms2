package com.zs.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zs.pms.po.TUser;
import com.zs.pms.service.UserService;

/**
 * 提供基于Restful风格的WebService
 * @author Administrator
 *
 */
@Controller
public class RestController {
	
	@Autowired
	UserService us;
	
	/**
	 * 访问指定用户信息
	 * {id}占位符 在实际url中是用户的id
	 * method 请求类型 get表示查询 默认不谢为get
	 * @param id 
	 * @return 用户信息转成json数据
	 */
	@RequestMapping(value="user/{id}.do",method=RequestMethod.GET)
	@ResponseBody
	public TUser get(@PathVariable("id") int id) {
		return us.queryById(id);
	}

}
