package aop_wildchars.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	
	@Before("allGETTERS() && allCircleGetter()")
	public void LoggingAdvice()
	{
		System.out.println("Advice Run: logging advice method ");
	}
	
	@Before("allGETTERS()")
	public void LoggingAdvice2()
	{
		System.out.println("Advice Run: 2nd advice method ");
	}
	
	@Pointcut("execution(public * get*())")
	public void allGETTERS()
	{
		
	}
	
	@Pointcut("within(aop_wildchars.model.Circle)")
	public void allCircleGetter()
	{
		
	}
	
	

}
