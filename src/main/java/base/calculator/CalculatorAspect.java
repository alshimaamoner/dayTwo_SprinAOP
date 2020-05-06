package base.calculator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component("CalculatorAspect")
public class CalculatorAspect {
    @Pointcut("execution(* base.com.jedriver.spring.service..add(..))")
    public void addOperation(){
        System.out.println(" add ");
    }
    @Before("addOperation()")
    public void before(JoinPoint joinPoint){
        System.out.println("The Method :" +joinPoint.getSignature().getName()+";\n"+"The Arguments: "+
                Arrays.toString(joinPoint.getArgs()));
    }
    @AfterReturning(returning = "result",pointcut = "addOperation()")
    public void after(JoinPoint joinPoint,Object result){
        System.out.println("(After Return ) : The Method :" +joinPoint.getSignature().getName()+";\n"+
                "The Arguments: "+
                Arrays.toString(joinPoint.getArgs())+"The Return :"+result);
    }
    @AfterThrowing(value = "addOperation()",throwing = "exception")
    public void afterThrowing2(IllegalArgumentException exception) throws Throwable{
        System.err.println("Illegal Exception............");
    }

}
