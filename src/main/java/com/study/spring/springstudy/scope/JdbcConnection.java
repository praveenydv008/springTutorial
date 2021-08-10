package com.study.spring.springstudy.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON,
proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {
	
	
	  public JdbcConnection() { System.out.println("this is jdbc template"); }
	 
	
	public void print() {
		System.out.println("Test jdbc");
	}

}