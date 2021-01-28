package com.andy;

import com.andy.ba02.Student;
import com.andy.ba02.School;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Andy
 * @Date: 2021/1/20 - 16:40
 * @Description: com.andy
 */
public class MyTest02 {

    @Test
    public void test01() {
        String config="ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取Student对象
        Student myStudent = (Student) ac.getBean("mystudent");
        System.out.println("Student对象="+myStudent);

        //Date myDate = (Date) ac.getBean("mydate");
        //System.out.println("Date:"+myDate);

    }

    @Test
    public void test02() {
        System.out.println("===test02===");
        Student student = new Student();
        student.setName("andy");
        student.setAge(20);
        School school = new School();
        school.setName("NCEPU");
        school.setAddress("Beijing");

        student.setSchool(school);
        System.out.println("Student对象="+student);


    }

}


