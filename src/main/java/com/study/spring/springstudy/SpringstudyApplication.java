package com.study.spring.springstudy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.study.spring.springstudy.scope.PersonDao;

@SpringBootApplication
public class SpringstudyApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringstudyApplication.class);
			
	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringstudyApplication.class, args);
		
		PersonDao personDao1 = appContext.getBean(PersonDao.class);
		PersonDao personDao2 = appContext.getBean(PersonDao.class);
		
		LOGGER.info("{}",personDao1);
		LOGGER.info("{}",personDao1.getJdbcConnection());
		//LOGGER.info("{}",personDao1.jdbcConnection);
		
		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection());
		//LOGGER.info("{}",personDao2.jdbcConnection);
		
		SpringApplication.exit(appContext);
		
	}

}
