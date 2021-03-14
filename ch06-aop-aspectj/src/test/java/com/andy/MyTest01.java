package com.andy;

import com.andy.ba01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Andy
 * @Date: 2021/3/14 - 15:21
 * @Description: com.andy
 */
public class MyTest01 {
    @Test
    public void test01() {
        String config="applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService)ac.getBean("someService");
        //通过代理对象执行方法，会在执行时自动增强功能
        //proxy实际上是com.sun.proxy.$Proxy_对象,底层使用的是jdk的动态代理
        System.out.println("proxy==="+proxy.getClass().getName());
        proxy.doSome("andy",20);


    }
}
