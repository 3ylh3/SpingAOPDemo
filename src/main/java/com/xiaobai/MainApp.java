package com.xiaobai;

import com.xiaobai.Exception.UnpalatableException;
import com.xiaobai.guest.Guest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationConfig.xml");
        Guest guest1 = (Guest)ctx.getBean("guest1");
        Guest guest2 = (Guest)ctx.getBean("guest2");
        Guest guest3 = (Guest)ctx.getBean("guest3");
        try {
            guest1.eat();
            System.out.println();
            guest1.pay(100);
            System.out.println();
            guest2.eat();
            System.out.println();
            guest3.eat();
        }
        catch (UnpalatableException e){
            System.out.println(e.toString());
        }
    }
}
