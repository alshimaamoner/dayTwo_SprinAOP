package base.calculator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component("before")
@Order(0)
public class CalculatorBefore {

    @Before("execution(*  *.* (..))")
    public void before(JoinPoint joinPoint){
        System.out.println("Order 0 The Method :" +joinPoint.getSignature().getName()+";\n"+"The Arguments: "+
                Arrays.toString(joinPoint.getArgs()));
    }
}
