package assignment13.session1.Assignment13_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
		public static void main(String[] args) {  
	    ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");   
	    BusinessLogic businessLogic =ac.getBean("proxy",BusinessLogic.class);  
	    businessLogic.m();  
	}
}
