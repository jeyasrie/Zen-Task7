package exceptionhandlepack;

import java.util.ArrayList;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create arraylist for name
  ArrayList<String> name= new  ArrayList<>();
 // using add  method to add the name to arraylist
  name.add("kelvin");
  name.add("abi");
  name.add("chandhu");
  name.add("selvi");
  name.add("vino");
  name.add("nivi");
  name.add("lavanya");
  name.add("elango");
  //print the arraylist of name
  		System.out.println("print the name of arraylist :"+name);
  		//using remove() method to remove the name chandhu from arraylist
  		System.out.println("remove the name "+ name.remove(2) +" from arraylist");
  		// print the name of arraylist
  		System.out.println(name);
  		//using removeall() method to reomove all the elements from the arraylist
  		System.out.println("remove alla the name from arraylist :" +name.removeAll(name));
  		System.out.println("after remove all the elements from array list :"+name);
	}

}

//Output
//print the name of arraylist :[kelvin, abi, chandhu, selvi, vino, nivi, lavanya, elango]
//remove the name chandhu from arraylist
//[kelvin, abi, selvi, vino, nivi, lavanya, elango]
//remove alla the name from arraylist :true
//after remove all the elements from array list :[]

