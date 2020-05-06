package base.calculator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class CalculatorAround {
    @Around("execution(* base.com.jedriver.spring.service..add(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("The Method :" +joinPoint.getSignature().getName()+";\n"+"The Arguments: "+
                Arrays.toString(joinPoint.getArgs()));
        Object result=null;
        try{
            result=joinPoint.proceed();
        }catch (IllegalArgumentException ex){
            ex.printStackTrace();
            throw ex;
        }
        return result;
    }
}
