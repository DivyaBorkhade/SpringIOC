package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
		
		
//      When scope = Singleton, ApplicationContex work as Eager Loading		
//		Student s = (Student)ac.getBean("s");  No need to create object(Constructor will get call automatically)
//		
//		s.display();
//	

	}

}
