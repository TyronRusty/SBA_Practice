package org.perscholas;
import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExecptionSBA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//divide();
		// I am having an issue here, I try to took at other people's code but can figure out why mine breaks
TypingPractice typedpractice = new TypingPractice();
typedpractice.typeAbc();
	}
static void divide()
{
	System.out.println("Enter two integers");
	boolean loopAgain = true;
	while (loopAgain)
	{
		try {
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			int div = x/y;
			System.out.println(div);
			loopAgain = false ;
		} catch (ArithmeticException e) {
			System.out.println("Please do not use zero");
			
		}
		catch (InputMismatchException e) {
			System.out.println("Please only use integers");
		}	
	}
	
	System.out.println("Done!!");
}
class MyException extends Exception {
	MyException(){};
	MyException (String message){
		super(message);
	
	}
}
class TypingPractice 
{
	
void  typeAbc () throws MyException{
	Scanner sc = new Scanner(System.in);
	String typed = "";
	boolean loopAgain = true;
	while (loopAgain) {
		try {
			
			System.out.println("Enter a string");
			typed = sc.next();
			if (!(typed.equals("abc"))) {
				throw new MyException ("incorrect input");
			}
			loopAgain = false;
		}
		catch(MyException e)
		
		{
			System.out.println(e.toString());
			
		}
	}
	
}
	}
}
