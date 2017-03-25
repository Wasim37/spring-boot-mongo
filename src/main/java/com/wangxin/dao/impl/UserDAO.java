package com.wangxin.dao.impl;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.wangxin.bean.User;
import com.wangxin.dao.IUserDAO;

@Repository
public class UserDAO extends BaseDAO implements IUserDAO {

	@Override
	public User getUserByName(String name) {
		return this.getMongoTemplate().findOne(new Query(Criteria.where("name").is(name)), User.class);
	}
}
