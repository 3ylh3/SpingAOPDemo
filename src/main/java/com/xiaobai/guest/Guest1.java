package com.xiaobai.guest;

public class Guest1 implements Guest {
    public void eat(){
        System.out.println("Guest1 is eating");
    }
    public void pay(int money){
        System.out.println("Guest1 is paying " + money);
    }
}
