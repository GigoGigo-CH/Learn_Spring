package com.andy;

import com.andy.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;
import java.util.Date;

/**
 * @Author: Andy
 * @Date: 2021/1/20 - 16:40
 * @Description: com.andy
 */
public class MyTest {

    @Test
    public void test01() {
        String config="ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取Student对象
        Student myStudent = (Student) ac.getBean("mystudent");
        System.out.println("Student对象="+myStudent);

        //Date myDate = (Date) ac.getBean("mydate");
        //System.out.println("Date:"+myDate);

    }

}


