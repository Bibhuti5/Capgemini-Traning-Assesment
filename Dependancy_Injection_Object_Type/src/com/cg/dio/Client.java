package com.cg.dio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		/*Student student = new Student();
		MathCheat cheat = new MathCheat();
		student.setMathCheat(cheat); */
	    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	    System.out.println("It is working ");
	    Student student=context.getBean("stu",Student.class);
	    student.cheating();
	    
	   NewStudent newStudent = context.getBean("newStudent",NewStudent.class);
//	   newStudent.startCheating();
	}
}
