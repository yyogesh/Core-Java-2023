package org.ysquare;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.ysquare.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println( "Hello World!" );

        Human human = context.getBean(Human.class);
        // human.setAge(21);
        System.out.println(human.getAge());
        human.travel();

      //  Car car = context.getBean("AUDI", Car.class);
//        Car car = context.getBean(Car.class);
//        car.drive();

//        Car car1 = context.getBean(Car.class);
//        car1.drive();
    }
}
