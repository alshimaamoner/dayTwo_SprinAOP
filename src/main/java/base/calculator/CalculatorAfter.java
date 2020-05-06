package base.calculator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class CalculatorAfter {
    @After("execution(* base.com.jedriver.spring.service..add(..))")
    public void after(JoinPoint joinPoint){
        System.out.println("After The Method :" +joinPoint.getSignature().getName()+";\n"+"The Arguments: "+
                Arrays.toString(joinPoint.getArgs()));
    }
}
