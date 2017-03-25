import java.util.*;
import java.lang.*;
import java.io.*;

class ass242
{	
	public static void main(String args[])
	{
		int x,y;
		System.out.println("Enter the mark and age of the student");
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		
		if ((x > 70 && x <= 100) || (x > 60 && x <= 100 && y < 15))
		System.out.println("The student has secured A grade for the marks " + x + " and age " + y);
		else if ((x > 60 && x <= 70) || (x >= 45 && x <= 60 && y < 15))
		System.out.println("The student has secured B grade for the marks " + x  + " and age " + y);
		else if ((x < 61) || (x < 45 && y < 15))
		System.out.println("The student has secured C grade for the marks " + x + " and age " + y);
	}
}