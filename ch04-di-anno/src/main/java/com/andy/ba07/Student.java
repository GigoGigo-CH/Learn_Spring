package com.andy.ba07;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: Andy
 * @Date: 2021/2/13 - 15:27
 * @Description: com.andy.ba01
 */
@Component("myStudent")
public class Student {
    @Value(value = "${myname}")
    private String name;
    private Integer age;

    /*
    * 引用类型
    * @Resource：来自jdk中的注解，spring框架提供了对这个注解的功能支持，可以使用它给引用类型赋值
    *            原理也是自动注入，支持byName，byType，默认byName
    * 位置： 1.在属性定义的上面，无需set方法，推荐使用
    *       2.在set方法上面
    *
    * 要使@Resource只用byName，需要增加属性name（bean的id）
    *
    * */

    //默认为byName，若自动注入失败，再使用byType
    @Resource(name = "mySchool")
    private School school;

    public Student() {
        System.out.println("执行了Student的无参构造");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value(value = "${myage}")
    public void setAge(Integer age) {
        System.out.println("setAge:"+age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
