/** 
 * File Name: User.java 
 * Description: 
 * Copyright: Copyright (c) 2016
 * Company: tyxj
 * @author: WangX
 * @version: 1.0
 * create at: 2016-7-21下午6:07:14 
*/  
  
package com.wangxin.bean;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
  
/**
 * @ClassName: User
 * @Description: TODO
 * @author WangX
 * @Date: 2016-7-21 下午6:07:14
 */
@Document
public class User extends AbstractDocument{
	
	@Indexed
	private String name;
    private Integer age;
    private String password;
    
    public User(){
    	
    }
    
	public User(String name, Integer age, String password) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
}
  