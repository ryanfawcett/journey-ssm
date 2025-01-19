# 基于XML配置文件方式的组件管理

### 基本实现步骤

1. 准备注入的类

```java
public interface Button {
  void onClick();
}
```

```java
public class HtmlButton implements Button {
  public void onClick() {
    System.out.println("clicked! Button Says - 'Hello World!'");
  }
}
```

2. 在XML文件中注入

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <!-- No args constructor bean -->
    <bean id="htmlButton" class="org.example.buttons.HtmlButton"/>
</beans>
```

### 一、组件信息声明配置(IoC)

1. 无参构造
2. 基于静态工厂方法实例化: factor-method指定的工厂方法必须是static

```java
public class HtmlButtonStaticFactory {
    private static final HtmlButton htmlButton = new HtmlButton();

    private HtmlButtonStaticFactory() {
        // NOOP
    }

    public static HtmlButton createHtmlButtonInstance() {
        return htmlButton;
    }
}
```

```xml
<bean id="staticFactoryHtmlBtn" class="org.example.buttons.HtmlButtonStaticFactory" factor-method="createHtmlButton" />
```

3. 基于实例工厂方法实例化

```java
public class HtmlButtonFactory {
    private static final HtmlButton htmlButton = new HtmlButton();

    private HtmlButtonFactory() {
        // NOOP
    }

    public HtmlButton createHtmlButtonInstance() {
        return htmlButton;
    }
}
```

```xml
<bean id="btnFactory" class="org.example.buttons.HtmlButtonFactory" />

<bean id="factoryHtmlBtn" factor-bean="btnFactory" factor-method="" />
```