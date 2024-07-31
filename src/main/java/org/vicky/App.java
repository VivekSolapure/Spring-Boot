package org.vicky;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        //here we are using spring framework without spring boot librabries which gives us the 2 main thing
        //that is autoconfig and spring and also gives .jar file for hosting and multiple dependency to download

        //ApplicationContext will create a container were all the objects are created and stored
        //And here we are using spring.xml file were we define, of which class the object should be created( In the bean )
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // here we have imported application context dependency from pom.xml were we have created this dependency
//        Dev obj = context.getBean(Dev.class);
//        obj.build();
    }
}
