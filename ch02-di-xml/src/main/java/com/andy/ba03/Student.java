package com.andy.ba03;

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
        System.out.println("spring会调用类的无参构造方法创建对象");
    }

    /*
    * 创建一个有参构造
    * */
    public Student(String myname,int myage,School mySchool) {
        System.out.println("===Student的有参构造方法===");
        //属性赋值
        this.name = myname;
        this.age = myage;
        this.school = mySchool;
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
        //System.out.println("调用setSchool:"+school);
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
