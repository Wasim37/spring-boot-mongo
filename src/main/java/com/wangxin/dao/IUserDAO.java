package com.wangxin.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.wangxin.bean.User;

public interface IUserDAO{
	
	public User getUserByName(String name);
	
}
