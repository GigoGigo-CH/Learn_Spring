package com.andy.ba01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Andy
 * @Date: 2021/2/13 - 15:27
 * @Description: com.andy.ba01
 */

/*
* @Component:用于创建对象，等同于<bean>的功能
*   属性：value 就是对象的名称，也就是bean的id值
*        value的值是唯一的，创建的对象在整个spring容器中就一个
*   位置：写在类的上面
*
*   @Component(value="myStudent")的作用等同于 <bean id="myStudent" class="com.andy.ba01.Student" />
*   也可以简写 @Component("myStudent")
*   若直接写 @Component 则由spring提供默认名称（首字母小写）
*
*   spring中和@Component功能一致，创建对象的注解还有：
*       1.@Repository（用在持久层类上）：放在dao的实现类上，表示创建dao对象，dao对象是能访问数据库的
*       2.@Service（用在业务层类的上面）：放在service的实现类上，创建service对象，
*         service对象用于事务处理，有事务等功能
*       3.@Controller（用在控制器上）：创建控制器对象，能够接受用户提交的参数，显示请求的处理结果
*
*       以上三个注解的使用语法于@Component一样，都能创建对象，但还拥有额外的功能
*       @Repository，@Service，@Controller是给项目的对象分层的
* */

@Component("myStudent")
public class Student {

    private String name;
    private Integer age;

    public Student() {
        System.out.println("执行了Student的无参构造");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
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
