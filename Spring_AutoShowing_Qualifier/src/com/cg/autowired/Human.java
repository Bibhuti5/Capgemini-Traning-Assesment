package com.cg.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	private Heart heart;
	
	public Human()
	{
		
	}
	public Human(Heart heart) {
		this.heart=heart;
		System.out.println("Human constr is getting called which has heart as argument in");
	}
	@Autowired
	@Qualifier("octpousHeart")
	
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter method called");
	}
	public void startPumping() {
		if(heart != null) {
			heart.pump();
			System.out.println("Name of the animal is :"+heart.getNameOfAnimal()+ "\n No of heart present :"+heart.getNoOfHeart());
		}else {
			System.out.println("You are dead");
		}
	}
}
