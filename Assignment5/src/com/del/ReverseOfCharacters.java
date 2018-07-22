package com.del;

public class ReverseOfCharacters {

	public static void main(String[] args) {
		char[] cArr =  {'B','U','H','D','I','U','Q','I','L'};
	    int left,right=0;
	    right=cArr.length-1;
	    for (left=0; left < right ; left++ ,right--)
	    {
	     // Swap values of left and right 
	     char temp = cArr[left];
	     cArr[left] = cArr[right];
	     cArr[right]=temp;
	    }
	    for (char c : cArr)
	     System.out.print(c);
	    System.out.println();
	   }

	}

