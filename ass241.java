import java.util.*;
import java.lang.*;
import java.io.*;

class ass241
{	
	public static void main(String args[])
{
		int x;
		System.out.println("Enter a value");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		
		if(x == 0)
		System.out.println("You have entered zero");
		else if (x > 0)
		System.out.println("You have entered a positive value");
        else if (x < 0)
		System.out.println("You have entered a negative value");
	}
}


		