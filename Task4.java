package exceptionhandlepack;

import java.io.File;
import java.util.Scanner;

class FileNotFoundException extends Exception
{
	//create a constructor for filenotfoundexception pass the string parameter
	//using string paramater  user get the message
	 FileNotFoundException(String s)
	 {
		 super(s);
	 }
}

    
public class Task4 {

    public static void main(String[] args) {
    	
        try {
            readFile("tst.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }
    }
// create the method of readfile pass the parameter of  the file name
    //throws filenotfoundexception  for that we get the message
    public static void readFile(String fileName) throws FileNotFoundException {
    	//create the file object
        File filer = new File(fileName);
    	//using if condition the file is not there or not
        if (!filer.exists()) {
        	
            throw new FileNotFoundException("The file " + fileName + " does not exist.");
        }

   

      
    }
}

//Output
//File not found: exceptionhandlepack.FileNotFoundException: The file tst.txt does not exist.
