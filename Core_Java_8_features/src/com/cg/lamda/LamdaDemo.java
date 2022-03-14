package com.cg.lamda;

interface A {
	void show();
}

//class Any implements A {
//	public void show() {
//		System.out.println("Hello ");
//	}
//}

public class LamdaDemo {
	public static void main(String[] args) {
		A obj;
//		obj = new A() {
//			public void show() {
//				System.out.println("Hello ");
//			}
//		};
		
		obj = ()-> System.out.println("hello");
		obj.show();
	}
}
