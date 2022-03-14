package com.cg.aop_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.aop_test.servicef.ShapeService;

public class AopMain {
    public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService =ctx.getBean("shapeService",ShapeService.class);
		System.out.println(shapeService.getCircle().getName());
	}
}
