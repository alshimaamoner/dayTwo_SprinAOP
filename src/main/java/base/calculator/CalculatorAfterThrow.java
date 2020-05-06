package base.calculator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class CalculatorAfterThrow {
    @AfterThrowing(value = "execution(*  *.* (..))")
    public void afterThrowing(JoinPoint joinPoint) throws Throwable{
        System.out.println("(After Return ) : The Method :" +joinPoint.getSignature().getName()+";\n"+"The Arguments: "+
                Arrays.toString(joinPoint.getArgs()));
        System.err.println("Exception............");
    }
    @AfterThrowing(value = "execution(*  *.* (..))",throwing = "exception")
    public void afterThrowing2(IllegalArgumentException exception) throws Throwable{
        System.err.println("Illegal Exception............");
    }
    @AfterThrowing(value = "execution(*  *.* (..))",throwing = "throwable")
    public void afterThrowing3(JoinPoint joinPoint,Throwable throwable) throws Throwable{
        System.out.println("(After Return ) : The Method :" +joinPoint.getSignature().getName()+";\n"+"The Arguments: "+
                Arrays.toString(joinPoint.getArgs()));
        System.err.println("Illegal Exception............");
    }
}
