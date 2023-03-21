package com.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
		
		
	    //  When scope = Singleton, ApplicationContex work as Eager Loading		
		
	    //Student s = (Student)ac.getBean("s"); // need to create object(constructor will get call automatically)
		
			//s.display();

	}

}
