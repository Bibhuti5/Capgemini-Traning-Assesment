package com.cg.ancestors;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		
	   String[] gen = new String[]{"a", "b", "c"};   
	   
		int num;
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number");
	    num=sc.nextInt();
	    if(num>0)
	    {
	    	System.out.println("The no is positive");
	    }
	    else if (num<0) {
	    	System.out.println("The number is negative");
	    }
	    
	    else 
	    {
	    	System.out.println("Me !");
	    }
	
	}

}
