package com.xiaobai.guest;

import com.xiaobai.Exception.UnpalatableException;

public class Guest3 implements Guest{
    public void eat() throws UnpalatableException{
        System.out.println("Guest3 is complaining");
        throw new UnpalatableException();
    }
    public void pay(int money){
        System.out.println("Guest3 is paying " + money);
    }
}
