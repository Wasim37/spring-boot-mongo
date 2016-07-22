package com.wasim.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.wasim.bean.User;

public interface IUserDAO{
	
	public User getUserByName(String name);
	
}
