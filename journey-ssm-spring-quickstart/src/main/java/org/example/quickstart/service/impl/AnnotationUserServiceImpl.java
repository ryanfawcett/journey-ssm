package org.example.quickstart.service.impl;

import org.example.quickstart.service.AnnotationUserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component("annotationUserService")
@Service
public class AnnotationUserServiceImpl implements AnnotationUserService {
    @Override
    public void save() {
        System.out.println("annotation user service save...");
    }
}
