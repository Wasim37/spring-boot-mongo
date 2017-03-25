/** 
 * File Name: IUserService.java 
 * Description: 
 * Copyright: Copyright (c) 2016
 * Company: tyxj
 * @author: WangX
 * @version: 1.0
 * create at: 2016-7-21下午6:16:25 
*/  
  
package com.wangxin.service;

import com.wangxin.bean.User;
  
/**
 * @ClassName: IUserService
 * @Description: 用户服务层接口
 * @author WangX
 * @Date: 2016-7-21 下午6:16:25
 */
public interface IUserService {
	
	/**
	 * 根据名字获取用户
	 * @Title: getUserbyName
	 * @author WangX
	 * @Date: 2016-7-22 下午3:11:35
	 * @param @param name
	 * @return void
	 */
	User getUserbyName(String name);

}
  