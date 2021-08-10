package com.study.spring.springstudy.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDao {
	
	@Autowired
	public JdbcConnection jdbcConnection;
	
	//@Autowired
	  public PersonDao(JdbcConnection jdbcConnection) {
	  this.jdbcConnection=jdbcConnection; }
	 

	
	  public JdbcConnection getJdbcConnection() { 
		  jdbcConnection.print();
		  return jdbcConnection; }
	 
	 

	
			
			
			/*
			 * public void setJdbcConnection(JdbcConnection jdbcConnection) {
			 * this.jdbcConnection = jdbcConnection; }
			 */
			 
	 

}
