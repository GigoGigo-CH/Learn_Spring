package com.andy.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Andy
 * @Date: 2021/2/13 - 15:27
 * @Description: com.andy.ba01
 */

@Component("myStudent")
public class Student {
    /*
    * @Value：简单类型的属性赋值
    * 属性：value是String类型，表示简单类型的属性值
    * 位置：1.在属性定义的上面，无需set方法，推荐使用
    *      2.在set方法的上面
    *
    * */

    @Value(value = "Andy")
    private String name;

    private Integer age;

    public Student() {
        System.out.println("执行了Student的无参构造");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value(value = "20")
    public void setAge(Integer age) {
        System.out.println("setAge:"+age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
