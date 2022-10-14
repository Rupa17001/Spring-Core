/*
 * @author = Rupa
 * *********************Spring Core****************************************
 * Everything is manual not automated(like Spring Boot) */



package com.devlopSpring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {	
    	// ApplicationContect provides configuration
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	// an object of dev class is created 
        dev d = (dev) ac.getBean(dev.class);
        // d(object of dev class) call the method named printing
        d.printing();
        //value of dId(instance variable in dev class) is set using setter injection in spring.xml file
        System.out.println("Value of dId id "+d.getdId()+" which is set using setter injection");
    }
}










/*	this is deprecated code it's for my memory :)
 * 
  	import org.springframework.core.io.FileSystemResource;
	import org.springframework.beans.factory.BeanFactory;
	import org.springframework.beans.factory.xml.XmlBeanFactory;
 * //Bean factory is used to redirect to file
 
// bf redirects to XML file with FileSystemResource method
//spring.xml file has bean(path) to the dev class
BeanFactory bf =new XmlBeanFactory(new FileSystemResource("spring.xml"));*/