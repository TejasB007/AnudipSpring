package com.anudip.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("shape.xml");
//        Painter p= (Painter) context.getBean("tejas");
//        p.perform();
        
        Performer p=(Performer) context.getBean("bravo");
        p.perform();
    }
}
