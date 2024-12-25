package org.example.quickstart;

import org.example.quickstart.service.AnnotationUserService;
import org.example.quickstart.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring 框架入门案例
 *
 * @author ryan fawcett
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = ctx.getBean(UserService.class);
        userService.save();

        // DataSource dataSource = ctx.getBean(DataSource.class);
        // System.out.println("dataSource = " + dataSource);

        AnnotationUserService annotationUserService = ctx.getBean(AnnotationUserService.class);
        annotationUserService.save();
    }
}
