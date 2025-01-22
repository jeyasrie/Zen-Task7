package exceptionhandlepack;

import java.util.Scanner;

public class Task1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using scanner to get input from user
		Scanner scan=new Scanner(System.in);
		//get the first number store it in a
		System.out.println("enter the first number");
	    int a=scan.nextInt();
	    //get the second number store it in b variable name
	    System.out.println("enter the second number");
	    int b=scan.nextInt();
	//if dividr one number by zero  arithmetic exception will occur
	    //for that we are using tey catch block
	    try
	    {
	int c=a/b; // 3/0 we cant divide this sceerio
	}
	catch(ArithmeticException e) //arithmeticexception is occuring
	{
	System.out.println(e);
	}
	  //after try catch the  remaining code will execute  
	    //judt add the number and print
    int d=5+6;
    System.out.println(d);
	System.out.println("program ended");

	}

}
//Output
//enter the first number
//3
//enter the second number
//0
//java.lang.ArithmeticException: / by zero
//11
//program ended
