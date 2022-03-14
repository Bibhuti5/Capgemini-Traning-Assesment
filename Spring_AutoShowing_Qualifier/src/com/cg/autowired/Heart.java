package com.cg.autowired;

public class Heart {

	private String nameOfAnimal;
	private int noOfHeart;

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public int getNoOfHeart() {
		return noOfHeart;
	}

	public void pump() {
		System.out.println("Your heart is pumping");
		System.out.println("Alive");
	}

}
