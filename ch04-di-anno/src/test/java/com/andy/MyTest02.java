package com.andy;

import com.andy.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Andy
 * @Date: 2021/2/13 - 15:58
 * @Description: com.andy
 */
public class MyTest02 {
    @Test
    public void test02() {
        String config="ApplicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取对象
        Student student = (Student)ctx.getBean("myStudent");
        System.out.println("创建的Student对象："+student);

    }
}
