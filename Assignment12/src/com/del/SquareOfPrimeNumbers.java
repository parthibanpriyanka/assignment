package com.del;

public class SquareOfPrimeNumbers {

	public static void main(String[] args) {
		int i =1;
	       int num =0,SquareOfPrimeNumbers=0;
	       System.out.println("SQUARE OF PRIME NUMBERS IS : ");
	      
	       while(true)
	       {
	    	   int counter = 0 ;
	    	   for(num =i; num>=1; num--)
	 		  {
	 	             if(i%num==0)
	 		     {
	 	 		counter = counter + 1;
	 		     }
	 		  }
	    	   if (counter ==2)
	 		  {
	 		     
	 		     SquareOfPrimeNumbers = i*i;
	 		     if(SquareOfPrimeNumbers<=900)
	 		     System.out.print(SquareOfPrimeNumbers + " ");
	 		     else
	 		    	 break;
	 		  }	
	    	   i++;
	       } 


	}

}
