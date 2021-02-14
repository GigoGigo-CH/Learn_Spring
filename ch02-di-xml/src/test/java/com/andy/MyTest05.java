package com.andy;

import com.andy.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Andy
 * @Date: 2021/1/20 - 16:40
 * @Description: com.andy
 */
public class MyTest05 {

    @Test
    public void test01() {
        System.out.println("===test05===");
        String config="ba05/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取Student对象
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("Student对象="+myStudent);


    }

    @Test
    public void test() {



    }

}


