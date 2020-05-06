import base.Introduction.CalculatorImpl;
import base.Introduction.MaxCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {


    public Application() {

    }

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
//        base.com.jedriver.spring.service.CalculatorImpl service = context.getBean("calc", CalculatorImpl.class);
//
//        System.out.println(service.add(5,5));

        /////////////Throw Exception
      //  System.out.println(service.divide(5,0));

//        ///Introduction
        base.Introduction.CalculatorImpl service = context.getBean("calculator", CalculatorImpl.class);

        System.out.println(service.divide(5,5));
        MaxCalculator maxCalculator= (MaxCalculator) service;
        System.out.println("mAX IS "+maxCalculator.max(5,2));
//      ///Aspect With Xml Based
//        System.out.println("Aspect With Xml Based ....................");
//        base.AspectWithXmlBased.CalculatorImpl service2 = context.getBean("calculators", base.AspectWithXmlBased.CalculatorImpl.class);
//
//        service2.add(5,5);



    }
}
