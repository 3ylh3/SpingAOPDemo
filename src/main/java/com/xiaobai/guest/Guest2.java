package com.xiaobai.guest;

public class Guest2 implements Guest {
    public void eat(){
        System.out.println("Guest2 is eating");
    }
    public void pay(int money){
        System.out.println("Guest2 is paying " + money);
    }
}
