/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int[] arr;
         
      // allocating memory for 5 integers.
      arr = new int[5];
         
      // initialize the first elements of the array
      arr[0] = 10;
         
      // initialize the second elements of the array
      arr[1] = 20;
         
      //so on...
      arr[2] = 30;
      arr[3] = 40;
      arr[4] = 50;
         
      // accessing the elements of the specified array
      for (int i = 0; i < arr.length; i++)
         System.out.println("Element at index " + i + 
                                      " : "+ arr[i]);          
    }
}
	
