package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		
		Student s = ac.getBean("s",Student.class);
		
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAddr().getAreaname());
		System.out.println(s.getAddr().getCityname());
		
		
		//in case of byType bean id(adr) & reference name(addr) may be different
		
		//If multiple bean with same class are found ambigutive will be occur to resolve this add tag autowire candidate=false

	}

}
