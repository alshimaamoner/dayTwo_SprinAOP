package base.calculator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Aspect
@Component
public class CalculatorAfterReturning {
    @AfterReturning("execution(*  *.* (..))")
    public void after(JoinPoint joinPoint){
        System.out.println("(After Return ) : The Method :" +joinPoint.getSignature().getName()+";\n"+"The Arguments: "+
                Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "result",pointcut = "execution(*  *.* (..))")
    public void after2(JoinPoint joinPoint,Object result){
        System.out.println("(After Return ) : The Method :" +joinPoint.getSignature().getName()+";\n"+
                "The Arguments: "+
                Arrays.toString(joinPoint.getArgs())+"The Return :"+result);
    }
}
