package org.example.quickstart.service.impl;

import org.example.quickstart.service.AnnotationUserService;
import org.springframework.stereotype.Service;

@Service
public class AnnotationUserServiceImpl implements AnnotationUserService {
    @Override
    public void save() {
        System.out.println("annotation user service save...");
    }
}
