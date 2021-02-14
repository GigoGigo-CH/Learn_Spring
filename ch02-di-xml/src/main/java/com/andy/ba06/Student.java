package com.andy.ba06;

/**
 * @Author: Andy
 * @Date: 2021/1/25 - 15:56
 * @Description: com.andy.ba01
 */
public class Student {
    private String name;
    private int age;

    //声明一个引用类型
    private School school;


    public Student() {
        //System.out.println("spring会调用类的无参构造方法创建对象");
    }

    public void setName(String name) {
        //System.out.println("spring调用了setName方法");
        this.name = name;
    }

    public void setAge(int age) {
        //System.out.println("spring调用了setage方法");
        this.age = age;
    }

    public void setSchool(School school) {
        System.out.println("调用setSchool:"+school);
        this.school = school;
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
