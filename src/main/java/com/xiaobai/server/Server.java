package com.xiaobai.server;

import org.aspectj.lang.ProceedingJoinPoint;

public class Server {
    public void greet(){
        System.out.println("The server is greeting the guest");
    }

    public void cleanTable(){
        System.out.println("The server is  cleaning the table");
    }

    public void apologize(){
        System.out.println("The server is apologizing");
    }

    public void server(ProceedingJoinPoint joinPoint){
        System.out.println("The server is greeting the guest");
        try{
            joinPoint.proceed();
            System.out.println("The server is  cleaning the table");
        }
        catch (Throwable e){
            System.out.println("The server is apologizing");
            System.out.println(e.toString());
        }
    }

    public void receiveMoney(int money){
        System.out.println("The server is receiving money " + money);
    }
}
