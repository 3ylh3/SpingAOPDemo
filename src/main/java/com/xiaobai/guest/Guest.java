package com.xiaobai.guest;

import com.xiaobai.Exception.UnpalatableException;

public interface Guest{
    public void eat() throws UnpalatableException;
    public void pay(int money);
}
