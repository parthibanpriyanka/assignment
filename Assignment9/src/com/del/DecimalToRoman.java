package com.del;

public class DecimalToRoman {

	public static void main(String[] args) {
		for (int num = 1; num <= 3000; num++)
			/* Saving the Roman equivalent of the thousand, hundred, ten and units place of a decimal number */
		{
			String thousands[] = { "", "M", "MM", "MMM" };
			String hundreds[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
			String tens[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
			String units[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

			/* Finding the digits in the thousand, hundred, ten and units place */
			int thous = num / 1000;
			int hund = (num / 100) % 10;
			int ten = (num / 10) % 10;
			int unit = num % 10;

			/* Displaying equivalent Roman number */
			System.out.print(num +"=" + thousands[thous] + hundreds[hund] + tens[ten] + units[unit] + " ");
		}
	}

}
