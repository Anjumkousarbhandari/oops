package com.Anjum.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Anjum.Spring.dto.Qac;

public class Container{
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory (resource);
		
		
		Qac qac = (Qac)factory.getBean("Qac");
		System.out.println(qac.getEmpId());
		System.out.println(qac.getEName());
		System.out.println(qac.getAdress());
		System.out.println(qac.getEmail());
		
		
		
		
		
		
	}

}
