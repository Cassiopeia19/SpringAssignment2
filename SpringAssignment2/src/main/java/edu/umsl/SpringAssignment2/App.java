package edu.umsl.SpringAssignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        Student student = (Student)context.getBean("student");
        
        student.toString();
        
        ((ClassPathXmlApplicationContext)context).close();
        
    }
}