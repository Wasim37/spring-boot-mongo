package com.wasim.dao.impl;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.wasim.bean.User;
import com.wasim.dao.IUserDAO;

@Repository
public class UserDAO extends BaseDAO implements IUserDAO {

	@Override
	public User getUserByName(String name) {
		return this.getMongoTemplate().findOne(new Query(Criteria.where("name").is(name)), User.class);
	}
}
