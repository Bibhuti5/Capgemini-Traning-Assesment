package com.cg.inter;

interface Phone
{
	void call();
	default void message() {
		System.out.println("Message send");
	}
}

class AndriodPhone implements Phone
{

	public void call() {
     System.out.println("Calling");		
	}

}

public class test {
	public static void main(String[] args) {
		Phone p = new AndriodPhone();
		p.call();
		p.message();
	}
	
}
