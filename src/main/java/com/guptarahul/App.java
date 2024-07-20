package com.guptarahul;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
//        Vehicle vehicle = new Bus();
        // Vehicle vehicle = new Car();
        //
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Vehicle vehicle = applicationContext.getBean("vehicle", Vehicle.class);
        System.out.println(vehicle.getMileage());
        System.out.println(vehicle.getDiscountMessage());
    }
}
