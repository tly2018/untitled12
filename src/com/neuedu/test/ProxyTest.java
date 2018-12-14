package com.neuedu.test;
/*代理类*/
public class ProxyTest implements IServiceTest {
    /**/
    @Override
    public String getS() {
        //创建代理对象
        IServiceTest target = new ServiceTestImpl();
        //代理类调用目标方法
        String result = target.getS();
        //实现方法增强
        return result.toUpperCase();
    }
}
