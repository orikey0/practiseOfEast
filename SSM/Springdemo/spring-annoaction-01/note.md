## 注解配置使用
- 必须导入AOP的相关的包才可以正常使用
- 必须要添加context的依赖和约束
## 关于注解的相关使用
1.bean

2.属性如何注入
```java
@Value()
```
3.衍生的注解
@Component有几个眼神注解，在web开发中，会按照mvc三层架构分层
- dao[@Repository]
- service[@Srevice]
- controller[@Controller]

这三个注解表示的含义都是把类加载到Spring中去。

## 小结
- xml本身更加万能，维护简单方便。
- 注解不是自己的类使用不了，维护相对复杂。

最佳实践：xml用来管理bean，属性注入的方式使用注解来进行完成。

## 完全使用java的方式进行配置---关于配置类

使用JavaConfig进行配置，是Spring的一个子项目，在Spring4之后，成为了和匈奴功能


