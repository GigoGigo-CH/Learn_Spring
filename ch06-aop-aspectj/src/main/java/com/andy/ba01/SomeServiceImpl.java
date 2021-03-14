package com.andy.ba01;

/**
 * @Author: Andy
 * @Date: 2021/3/14 - 14:49
 * @Description: com.andy.ba01
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        //给doSome（）方法增加功能，在执行前打印时间
        System.out.println("=== 目标方法doSome() ===");

    }
}
