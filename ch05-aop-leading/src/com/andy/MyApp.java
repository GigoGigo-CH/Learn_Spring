package com.andy;

import com.andy.handler.MyInvocationHandler;
import com.andy.service.SomeService;
import com.andy.service.impl.SomeServiceImpl;
import com.sun.corba.se.impl.naming.pcosnaming.ServantManagerImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.sql.SQLOutput;

/**
 * @Author: Andy
 * @Date: 2021/3/12 - 19:22
 * @Description: com.andy.service
 */
public class MyApp {
    //This is the entrance to the program:
    public static void main(String[] args) {
        //调用doSome和doOther
//        SomeService service = new SomeServiceImpl();
//        service.doSome();
//        System.out.println("=============================");
//        service.doOther();

        //使用jdk的Proxy创建代理对象
        //创建目标对象
        SomeService target = new SomeServiceImpl();

        //创建InvocationHandler对象
        InvocationHandler handler = new MyInvocationHandler(target);

        //使用Proxy创建代理
        SomeService proxy = (SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);
        //实际是com.sun.proxy.$Proxy_
        System.out.println("proxy==="+proxy.getClass().getName());
        //通过代理执行相应方法，会调用handler中的invoke（）
        proxy.doSome();
        System.out.println("= = = = = =");
        proxy.doOther();

    }
}
