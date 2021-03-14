package com.andy.service.impl;

import com.andy.service.SomeService;
import com.andy.util.ServiceTools;

import java.util.Date;

/**
 * @Author: Andy
 * @Date: 2021/3/12 - 19:20
 * @Description: com.andy.service.impl
 */
//无需修改实现类代码，也能增加 输出时间，事务 的功能
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行业务方法doSome");
    }

    @Override
    public void doOther() {
        System.out.println("执行业务方法doOther");
    }
}
