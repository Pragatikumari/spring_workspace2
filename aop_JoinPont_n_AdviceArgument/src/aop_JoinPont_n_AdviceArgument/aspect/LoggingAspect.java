package aop_JoinPont_n_AdviceArgument.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
 
	@Before("allCircleGetter()")
	public void LoggingAdvice(JoinPoint joinpoint)   //joinpoint reurns an object of the class whose method triggered the advice 
	{
		System.out.println(joinpoint.toString());
	}
	
	 @Before("args(name)")
	public void BeforeStringArg(String name)
	{
		System.out.println(name+" passed as argument");
		
		
	}
	
	@Pointcut("execution(public * get*())")
	public void allGETTERS()
	{
		
	}
	
	@Pointcut("within(aop_JoinPont_n_AdviceArgument.model.Circle)")
	public void allCircleGetter()
	{
		
	}
	

}
