package com.pg.model;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
public class TaxCalculator {

	public static void main(String[] args) throws IOException {
		
		try(BufferedReader br1=new BufferedReader(new InputStreamReader(System.in))) 
		{
		String str="";
		str=br1.readLine();
		}
		catch(Exception e){
		 System.out.print(e);
		}
		finally
		{
			
		}
	}
}
