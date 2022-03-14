package com.cg.dio;

public class Student {
	private int id;
	private MathCheat mathCheat;
	private ScienceCheat cheat;

	public void setCheat(ScienceCheat cheat) {
		this.cheat = cheat;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void cheating() {
		cheat.cheat();
		System.out.println("Hay my id is " + id);
	}
}
