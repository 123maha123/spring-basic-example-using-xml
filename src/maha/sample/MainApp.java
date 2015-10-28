package maha.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main( String args[] ) {
        //Loads bean configuration and takes care of creation and installation of all beans
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        //getBean() uses bean ID to return a generic object
        Employee emp = (Employee) context.getBean("emp");
        System.out.println(emp.getAddress().getCountry());
    }
}