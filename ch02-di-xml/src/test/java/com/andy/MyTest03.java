package com.andy;

import com.andy.ba03.School;
import com.andy.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @Author: Andy
 * @Date: 2021/1/20 - 16:40
 * @Description: com.andy
 */
public class MyTest03 {

    @Test
    public void test01() {
        String config="ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取Student对象
        Student myStudent = (Student) ac.getBean("mystudent2");
        System.out.println("Student对象="+myStudent);

        File myFile= (File) ac.getBean("myFile");
        System.out.println("myFileName:"+myFile.getName());


        //Date myDate = (Date) ac.getBean("mydate");
        //System.out.println("Date:"+myDate);

    }

    @Test
    public void test() {



    }

}


