/** 
 * File Name: Application.java 
 * Description: 
 * Copyright: Copyright (c) 2016
 * Company: tyxj
 * @author: WangX
 * @version: 1.0
 * create at: 2016-7-21下午2:48:38 
 */

package com.wangxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: Application
 * @Description: TODO
 * @author WangX
 * @Date: 2016-7-21 下午2:48:38
 */

@EnableAutoConfiguration
@SpringBootApplication  
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
	
}
