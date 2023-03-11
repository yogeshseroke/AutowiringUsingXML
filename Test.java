package com.autowiringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowiringPractice/autoConfig.xml");
		//Emp emp = (Emp)context.getBean("emp1");
		Emp emp = context.getBean("emp1",Emp.class);
		System.out.println(emp);
	}

}
