package exceptionhandlepack;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the array for integer number
    int[] even= {2,4,6,8,10,12,14,16};
    //arrayindexoutofboundry  exception using try catch
    try
    {
   System.out.println( even[9]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
    	System.out.println("Arrayoutof index:"+e);
    }
    
    System.out.println();
    //crate the variable name  and pass the string valuse
    String name="krishna";
    //Stringindexoutofboundry exception using  try catch
    try
    {
    	 String sub=name.substring(1, 9);
    }
   catch(StringIndexOutOfBoundsException e)
   {
    System.out.println("string index does not exist:"+e);
	}
   
	}
}

//Output
//Arrayoutof index:java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8

//string index does not exist:java.lang.StringIndexOutOfBoundsException: Range [1, 9) out of bounds for length 7


