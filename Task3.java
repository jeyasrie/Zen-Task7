package exceptionhandlepack;

import java.util.Scanner;
//create own custom exception so need to extends Exception
class InvalidAgeException extends Exception
 {
	//we should create constructor to show the error message 
	 InvalidAgeException(String s)
	 {
		 super(s);
	 }
 }


public class Task3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using scanner method can get input from user
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the age");
		try
		{
		int age=scan.nextInt();
		//if age is below 18, throw custom exception
		//here we create InvalidAgeException
		if(age<18)
		{
       throw new InvalidAgeException("invalid age exception");
		}
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
	
	}

}

//Output
//enter the age
//15
//exceptionhandlepack.InvalidAgeException: invalid age exception

