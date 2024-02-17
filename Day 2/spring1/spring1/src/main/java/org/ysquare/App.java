package org.ysquare;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
      //  System.out.println( "Hello World!" );
      //  Developer obj = new Developer();
        Developer obj = context.getBean(Developer.class);
        obj.code();
        System.out.println( obj.getAge() );
    }
}
