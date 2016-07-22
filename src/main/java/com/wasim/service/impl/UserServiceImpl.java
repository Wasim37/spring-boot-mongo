/** 
 * File Name: UserServiceImpl.java 
 * Description: 
 * Copyright: Copyright (c) 2016
 * Company: tyxj
 * @author: WangX
 * @version: 1.0
 * create at: 2016-7-21下午6:16:49 
*/  
  
package com.wasim.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wasim.bean.User;
import com.wasim.dao.IUserDAO;
import com.wasim.service.IUserService;
  
/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @author WangX
 * @Date: 2016-7-21 下午6:16:49
 */
@Service("userService")
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserDAO userDAO;
	
	@Override
	public User getUserbyName(String name) {
		return userDAO.getUserByName(name);
	}
	
}
  