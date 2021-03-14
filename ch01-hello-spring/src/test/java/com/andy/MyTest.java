package com.andy;
import com.andy.ba01.SomeService;
import com.andy.ba01.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @Author: Andy
 * @Date: 2021/1/20 - 16:40
 * @Description: com.andy
 */
public class MyTest {
    @Test
    public void test01() {
        SomeService service = new SomeServiceImpl();        //正转方式，主动创建
        service.doSome();
    }


    /*
    *spring默认创建对象的时间：在创建spring的容器时，会创建配置文件中所有bean声明的对象
    * spring创建对象：默认调用的是无参数构造方法
    */
    @Test
    public void test02() {
        //使用spring容器创建对象
        //1.指定spring配置文件的名称
        String config="beans.xml";
        //2.创建表示spring容器的对象，ApplicationContext（作用域）
        // ApplicationContext表示spring容器， 通过这个容器就可以获取对象了
        //ClassPathXmlApplicationContext:表示从类路径中加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);     //创建容器，根据config加载配置文件
        //上句执行完毕后已经生成了SomeServiceImpl对象，可验证其无参构造方法已经执行
        //接下来可通过id获取这个对象

        //从容器中获取某个对象，要调用getBean（）方法
        //getBean（"配置文件中的bean的id值"）

        SomeService service = (SomeService) ac.getBean("someService");

        //使用spring创建好的对象
        service.doSome();

    }
     /*获取spring容器中java对象的信息
     *
     * */
    @Test
    public void test03() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //使用spring提供的方法获取容器中定义的对象数量
        int num = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象数量："+num);
        //获取容器中每个定义的对象名称（key值）
        String[] names = ac.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
    }

    @Test   //获取一个非自定义类的对象
    public void test04() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //使用getbean(),
        Date my = (Date)ac.getBean("mydate");
        System.out.println("Date:"+my);
    }

}


