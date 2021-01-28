package com.andy.ba01;

import org.springframework.core.style.ToStringCreator;

/**
 * @Author: Andy
 * @Date: 2021/1/25 - 15:56
 * @Description: com.andy.ba01
 */
public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("spring会调用类的无参构造方法创建对象");
    }

    public void setName(String name) {
        //System.out.println("spring调用了setName方法");
        this.name = name;
    }

    public void setAge(int age) {
        //System.out.println("spring调用了setage方法");
        this.age = age;
    }

    public void setEmail(String email)  {
        System.out.println("setEmail="+email);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @java.lang.Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
