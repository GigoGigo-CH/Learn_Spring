package com.andy.ba01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @Author: Andy
 * @Date: 2021/3/14 - 14:51
 * @Description: com.andy.ba01
 */
/*
*   @Aspect : 是aspectj框架中的注解，表示当前类为切面类
*   切面类：用来给业务方法增加功能的类，在这个类中有切面的功能代码
*   注解位置：类定义之上
* */
@Aspect
public class MyAspect {
    /*
    定义方法，方法用于实现切面功能
    方法定义的要求：
        1.公共方法public
        2.方法没有返回值
        3.方法名称自定义
        4.方法可以有参数，也可以没有参数
          如果有参数，参数不能是自定义的，有几个可选项
    * */

    /*
    * @Before；前置通知注解
    *   属性：value，是切入点表达式，表示切面的功能执行位置。
    *   位置：在方法的上面
    * 特点：
    *   1.在目标方法之前执行
    *   2.不会改变目标方法的执行结果
    *   3.不会影响目标方法的执行
    * */

    //execution表达式的多种写法

    /*@Before(value = "execution(public void com.andy.ba01.SomeServiceImpl.doSome(String,Integer))")
    public void myBefore() {
        //就是切面要执行的代码
        System.out.println("(前置通知)切面功能：在目标方法之前输出执行时间：" + new Date());
    }
}*/

    /*@Before(value = "execution(void *..SomeServiceImpl.doSome(String,Integer))")
    public void myBefore() {
        //就是切面要执行的代码
        System.out.println("(2======前置通知)切面功能：在目标方法之前输出执行时间：" + new Date());
    }
}*/

    @Before(value = "execution(void *..SomeServiceImpl.do*(..))")
    public void myBefore() {
        //就是切面要执行的代码
        System.out.println("(3======前置通知)切面功能：在目标方法之前输出执行时间：" + new Date());
    }

    @Before(value = "execution(* do*(..))")
    public void myBefore2() {
        //就是切面要执行的代码
        System.out.println("(4======前置通知)切面功能：在目标方法之前输出执行时间：" + new Date());
    }
}