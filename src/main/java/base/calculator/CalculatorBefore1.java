package base.calculator;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class CalculatorBefore1 {
    @Before("execution(*  *.* (..))")
    public void before(){
        System.out.println("Order 1 Before Your Service Method");
    }
}
