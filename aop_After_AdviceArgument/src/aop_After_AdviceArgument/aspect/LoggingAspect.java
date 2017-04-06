package aop_After_AdviceArgument.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	
	
	 
		/*@Before("allCircleGetter()")
		public void LoggingAdvice(JoinPoint joinpoint)   //joinpoint reurns an object of the class whose method triggered the advice 
		{
			System.out.println(joinpoint.toString());
		}*/
		
		 @After("args(name)")
		public void AfterStringArg(String name)
		{
			System.out.println(name+" passed as argument");
			
			
		}
		
		 
		 @AfterReturning(pointcut="args(name)" , returning="returnedString")
			public void AfterretStringArg(String name, String returnedString)
			{
				System.out.println(name+"AfterReturning"+" and name returned is "+returnedString);
				
				
			}
			
		 
		 @AfterThrowing(pointcut="args(name)", throwing="ex")
			public void Afterthrowingexp(String name, RuntimeException ex)
			{
				System.out.println(" exception thrown is "+ex);
				
				
			}
			
		 
		 
		@Pointcut("execution(public * get*())")
		public void allGETTERS()
		{
			
		}
		
		@Pointcut("within(aop_After_AdviceArgument.model.Circle)")
		public void allCircleGetter()
		{
			
		}

}
