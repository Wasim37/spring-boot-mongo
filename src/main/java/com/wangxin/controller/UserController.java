/** 
 * File Name: UserController.java 
 * Description: 
 * Copyright: Copyright (c) 2016
 * Company: tyxj
 * @author: WangX
 * @version: 1.0
 * create at: 2016-7-5上午9:11:15 
*/ 

package com.wangxin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wangxin.bean.User;
import com.wangxin.common.JsonUtil;
import com.wangxin.service.IUserService;


/**
 * @ClassName: UserController
 * @Description: 系统用户控制层
 * @author WangX
 * @Date: 2016年5月16日 上午10:21:54
 *
 */
@Controller
@RequestMapping("/user")
public class UserController{
	
	private static final Logger LOG =  LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private IUserService userService;
	
	@ResponseBody
	@RequestMapping("/query")
	public String getUserbyName() {
		User user = userService.getUserbyName("李四");
		return JsonUtil.objectToJson(user);
	}
	
}
