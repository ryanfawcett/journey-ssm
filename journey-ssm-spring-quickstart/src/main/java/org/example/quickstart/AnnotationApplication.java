package org.example.quickstart;

import org.example.quickstart.service.AnnotationUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AnnotationUserService annotationUserService = ctx.getBean(AnnotationUserService.class);
        annotationUserService.save();
    }
}
