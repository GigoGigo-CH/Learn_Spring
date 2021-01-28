ch02-di-xml：在spring的配置文件中，给java对象的属性赋值

di：Dependency Injection依赖注入

di的实现语法由两种：
1.在spring的配置文件中，使用标签和属性完成，叫做基于XML的di实现
2.使用spring中的注解，完成属性赋值，叫做基于注解的di实现

di的语法分类：
1.set注入（设值注入）：spring调用类的set方法，在set方法中可以实现属性的赋值。（80%使用set注入）
2.构造注入，spring调用类的有参构造方法完成复制


实现步骤：
1.创建maven项目
2.加入依赖：
    spring的依赖，版本5.2.5
    单元测试junit的依赖
3.创建类（接口和它的实现类）
这个类和没有使用框架时一样，普通的类
4.创建spring需要使用的配置文件
声明类的信息，这些类由spring创建和管理
通过spring的语法，完成属性赋值

5.测试spring创建的对象