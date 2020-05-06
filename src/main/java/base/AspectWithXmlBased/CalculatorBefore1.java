package base.AspectWithXmlBased;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("aspect")
public class CalculatorBefore1 {
    public void before(){
        System.out.println("Order 1 Before Your Service Method");
    }
}
