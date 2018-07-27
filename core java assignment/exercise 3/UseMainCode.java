package com.del;

public class UseMainCode {

	public static boolean checkTripplets(int[] array, Integer indices) {
		if (indices < 3) {
			return false;
		}
		
		for (int i = 0; i < indices; i++) {
			if((i+2)<indices && array[i]==array[i+1] && array[i+1]==array[i+2])
			{
				return true;
			}
		}
		return false;
	}
}
