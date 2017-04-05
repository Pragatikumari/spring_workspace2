package aop_demo.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public String aop_demo.model.Circle.getName())")
	public void LoggingAdvice()
	{
		System.out.println("Advice run: get Method Called");
	}

}
