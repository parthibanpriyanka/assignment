package com.del;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumAtPrime {
	
	private static int getSumAtPrime(int[] array, Integer indices) {
		 int i =0;
	       int sum=0;
	      
	       for (i = 0; i < indices; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(int j=2; j<=(i/2); j++)
		  {
	             if(i%j==0)
		     {
	 		counter++;
	 		if(counter==1)
	 		{
	 			break;
	 		}
		     }
		 
	       }
		  if (counter ==0){
			  if(i==0 || i==1)
			  { continue;
			  }
		     sum = sum + array[i];
		     //System.out.println(i + "="+sum);
		  }	
	       }
	     
	       return sum;
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		try {
			System.out.println("Enter the number of elements : ");
			Integer indices = scan.nextInt();
			 int array[]=new int[indices];

			    System.out.println("enter elements : ");
			    for(int i=0;i<indices;i++){//for reading array
			        		array[i]=scan.nextInt();
			    }
			    System.out.println("Sum at prime numbered indices is "+getSumAtPrime(array, indices));
		} catch (InputMismatchException e) {
			System.out.println("enter only numbers");
		}
	       finally {
	    	   scan.close();
	       }
	}

	

}
