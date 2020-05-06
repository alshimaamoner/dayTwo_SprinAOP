package base.com.jedriver.spring.service;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Set;
@Component("calc")
//@Aspect
public class CalculatorImpl  {
    private int num;
    private double nums;
    private String msg;
    private Set<String> admin;

    private static CalculatorImpl instance;
   public CalculatorImpl(){

    }
    public  CalculatorImpl(Set<String> admin){
        this.admin=admin;
    }
    public  CalculatorImpl(String hi){
        this.msg=hi;
    }
    public  CalculatorImpl(int num){
       this.num=num;

    }
    public  CalculatorImpl(double nums){
        this.nums=nums;

    }
    public double add(double num1, double num2) {
        return num1+num2;
    }

    public double subtract(double num1, double num2) {
        return num1-num2;
    }

    public double multiply(double num1, double num2) {
        return num1*num2;
    }

    public double divide(double num1, double num2) {
        if(num2==0)
            throw new RuntimeException("Invalid Second Number");
        return num1/num2;
    }

    public int getNum() {
        return num;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public double getNums() {
        return nums;
    }

    public void setNums(double nums) {
        this.nums = nums;
    }
    public  static CalculatorImpl getInstance(){
      if(instance==null) {
          instance = new CalculatorImpl();
          instance.setNum(9);
      }
      return instance;
    }
    public CalculatorImpl addObject(){

           CalculatorImpl calculator = new CalculatorImpl();
           calculator.setNum(10);
           calculator.setNums(20);
        return calculator;
    }
    public Set<String> getAdmin() {
        return admin;
    }

    public void setAdmin(Set<String> admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "CalculatorImpl{" +
                "num=" + num +
                ", nums=" + nums +
                ", msg='" + msg + '\'' +
                ", admin=" + admin +
                '}';
    }
}
