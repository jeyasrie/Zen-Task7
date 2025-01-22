package exceptionhandlepack;

import java.util.ArrayList;
import java.util.Iterator;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //create arraylist of string
		 ArrayList<String> name= new ArrayList<>();
		// using add method insert the value of list
		    name.add("bala");
		    name.add("vino");
		    name.add("chandhu");
		    name.add("waxton");
		   //print the list
		   System.out.println("ArrayList of name is :"+name);
		   //check the list sise using size() method
		    int s=name.size();
		    System.out.println("The length of the the list :"+s);
		    //using toarray  method to convert list to array
		    String[] arr=name.toArray(new String[0]);
		    //using array print the index 2 valuse
	          System.out.println("print index 2 value :"+arr[2]);
	        //  using enhanced for lopp to print the array value one by one
		  for(String val:arr)
		  {
			  System.out.println(val);
		  }
		    
		
	}

}

//Output
//ArrayList of name is :[bala, vino, chandhu, waxton]
//The length of the the list :4
//print index 2 value :chandhu
//bala
//vino
//chandhu
//waxton