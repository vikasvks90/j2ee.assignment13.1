package assignment13.session1.Assignment13_1;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AdviceDemo implements MethodBeforeAdvice{  

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("additional concern before actual logic");
		
	}  
}  
