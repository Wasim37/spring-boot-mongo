package com.wangxin.dao.impl;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository("dataManager")
public class BaseDAO {

	@Autowired
	private MongoTemplate mongoTemplate;
	
    protected MongoTemplate getMongoTemplate(){
        return  this.mongoTemplate;
    }
    
	public List<?> findAll(Class<?> entity) {
		return mongoTemplate.findAll(entity);
	}
	
	public List<?> findByRegex(String regex, Class<?> entity) {
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Criteria criteria = new Criteria("name").regex(pattern.toString());
		return mongoTemplate.find(new Query(criteria), entity);
	}
	
	public <T> T findOne(String id, Class<T> entity) {
		return mongoTemplate.findOne(new Query(Criteria.where("id").is(id)), entity);
	}
	
	public void insert(Object entity) {
		mongoTemplate.insert(entity);
	}
	
	public void removeOne(String id, Class<?> entity) {
		Criteria criteria = Criteria.where("id").in(id);
		if (criteria != null) {
			Query query = new Query(criteria);
			if (query != null && mongoTemplate.findOne(query, entity) != null)
				mongoTemplate.remove(mongoTemplate.findOne(query, entity));
		}
	}
	
	public void updateEntity(Object entity) {
		mongoTemplate.save(entity);
	}

	public <T> T findEntityByCriteria(Criteria criteria, Class<T> entity) {
		Query query = new Query();
		query.addCriteria(criteria);
		return mongoTemplate.findOne(query, entity);
	}

}
