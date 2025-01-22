package exceptionhandlepack;

import java.util.TreeMap;


public class Task6 {

	public static void main(String[] args) {
		
	  //tree only print value in alphabetical order 
		// TODO Auto-generated method stub
		//create emplyee treemap with string and integer
		TreeMap<Integer,String> employee=new TreeMap<Integer,String>();
		//using put method insert the value
		
		employee.put(55,"kala");
		employee.put(20,"bala");
		employee.put(39,"nani");
		employee.put(28,"sasi");
		employee.put(15,"eshwar");
		employee.put(94,"ilango");
	     System.out.println(employee);
		//print the employee alphabetical order
		System.out.println("employee name in alphabetical order :");
		//values() method used to return the values obtained in the map
		//stream() method  provides a set of elements of spicific type in a sequentioal manner
		//forEach() operation allows us to perform an action on each element of a stream
		employee.values().stream().sorted().forEach(System.out::println);
	}

}

//Output
//{15=eshwar, 20=bala, 28=sasi, 39=nani, 55=kala, 94=ilango}
//employee name in alphabetical order :
//bala
//eshwar
//ilango
//kala
//nani
//sasi
