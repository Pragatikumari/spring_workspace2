package aop_wildchars.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	
	@Before("allGETTERS()")
	public void LoggingAdvice()
	{
		System.out.println("Advice Run: logging advice method ");
	}
	
	@Before("allGETTERS()")
	public void LoggingAdvice2()
	{
		System.out.println("Advice Run: logging advice method ");
	}
	
	@Pointcut("execution(public * get*())")
	public void allGETTERS()
	{
		
	}

}
