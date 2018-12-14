package com.neuedu.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*代理类*/
public class TestP implements InvocationHandler {
    //目标对象传入
    public Object obj;

    public void setObj(Object obj) {
        this.obj = obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("a");
        //接收对象 是方法的返回值 如果没有返回值 则为null
        method.invoke(obj,args);
        System.out.println("b");
        return null;
    }
}
