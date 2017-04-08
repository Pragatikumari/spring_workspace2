package aop_Xml_config.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


public class LoggingAspect {
	
	 	 
 
		 public Object aroundAdvice(ProceedingJoinPoint proceedingjoinPoint)
		 {
			 Object rvalue= null;
			 
			 try {
				 
				 System.out.println("before advice");
				 
				rvalue= proceedingjoinPoint.proceed();
				
				System.out.println("After returning");
			} catch (Throwable e) {
				 
				System.out.println("After Throwing"); 
				
			}
			 System.out.println("after finally");
			 
			 return rvalue;
		 }
		 
		 
		 
		 
}
