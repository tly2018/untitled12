package com.neuedu.test;

import java.lang.reflect.Proxy;

public class TestMain {
    public static void main(String[] args) {
        //代理模式 在不改变原来方法的基础上实现数据增强
        //静态代理 有实现类的存在  动态代理 没有实现类的存在 代理对象是动态生成的
        //代理 1 目标对象 要被增强的对象 2 代理对象 要增强的功能  3 目标对象和代理对象 之间的关系--实现相同的接口
       /* IServiceTest service = new ProxyTest();
        String str = service.getS();
        System.out.println(str);*/
       /*
       * 1 目标对象
       * 2 代理对象 动态代理 是动态生成对象
       * */






    }
}
