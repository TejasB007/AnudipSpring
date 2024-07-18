package com.anudip.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext  context = new 
    			ClassPathXmlApplicationContext("springconfig.xml"); 

    	// Painter painter1=(Painter) context.getBean("tejas");
    	// painter1.perform();
    	
    	Performer per1 = (Performer) context.getBean("tb");
    	per1.perform();
    }
}
