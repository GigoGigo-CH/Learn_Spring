package com.andy.service.impl;

import com.andy.service.SomeService;

/**
 * @Author: Andy
 * @Date: 2021/1/20 - 16:36
 * @Description: com.andy.service.impl
 */
public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl() {
        System.out.println("SomeServiceImpl的无参构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("执行了SomeServiceImp的doSome方法");
    }
}
