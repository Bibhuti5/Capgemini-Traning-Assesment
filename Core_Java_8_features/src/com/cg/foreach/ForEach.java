package com.cg.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsImp implements Consumer<Integer>
{
	public void accept(Integer i)
	{
		System.out.println(i);
	}
}
// For each method in java 8
public class ForEach {
     public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		// This is internal foreach loop method.
		// It saves time to processing  
		values.forEach(i->System.out.println(i));
	}
}
