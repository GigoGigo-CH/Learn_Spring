package com.andy;
import com.andy.service.SomeService;
import com.andy.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

//        SomeService service = (SomeService) ac.getBean("someService");

        //使用spring创建好的对象
//        service.doSome();

    }
}


