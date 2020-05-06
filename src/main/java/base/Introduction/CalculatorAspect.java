package base.Introduction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorAspect {
    @DeclareParents(defaultImpl = MaxCalculatorImpl.class,value = "base.Introduction.CalculatorImpl")
    public MaxCalculator maxCalculator;
    @DeclareParents(defaultImpl = MinCalculatorImpl.class,value = "base.Introduction.CalculatorImpl")
    public MinCalculator minCalculator;
}
