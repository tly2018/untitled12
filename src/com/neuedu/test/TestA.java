package com.neuedu.test;

import java.lang.reflect.Proxy;

public class TestA {
    public static void main(String[] args) {
        Itest t = new Test();
        TestP p = new TestP();
        p.setObj(t);
        Itest a = (Itest)Proxy.newProxyInstance(t.getClass().getClassLoader(),t.getClass().getInterfaces(),p);
        a.productA();
    }
}
