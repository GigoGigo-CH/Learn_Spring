package com.andy.util;

import java.util.Date;

/**
 * @Author: Andy
 * @Date: 2021/3/12 - 19:50
 * @Description: com.andy.service.com.andy.util
 */
public class ServiceTools {
    public static void doLog() {
        System.out.println("方法执行的时间：" + new Date() );
    }

    public static void doTrans() {
        System.out.println("方法执行完毕后，提交事务");
    }
}
