package com.andy.handler;

import com.andy.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.DoubleSummaryStatistics;

/**
 * @Author: Andy
 * @Date: 2021/3/12 - 20:29
 * @Description: com.andy.handler
 */
public class MyInvocationHandler implements InvocationHandler {
    //传入目标对象
    private Object target;  //运行时target会指向SomeServiceImpl
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("===执行了invoke方法===");
        String methodName = method.getName();
        System.out.println("参数method：" + methodName);
        //通过代理对象在执行方法时，会调用执行这个invoke（）
        Object res = null;

        if("doSome".equals(methodName)) {
            ServiceTools.doLog();

            //执行目标类的方法，通过method实现
            res = method.invoke(target, args);    //运行时它其实就是运行传入的SomeServiceImpl中的method

            ServiceTools.doTrans();
        } else {
            res = method.invoke(target, args);    //运行时它其实就是运行传入的SomeServiceImpl中的method
        }

        //目标方法执行结果
        return res;
    }
}
