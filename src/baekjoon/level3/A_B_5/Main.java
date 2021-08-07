package baekjoon.level3.A_B_5;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a, b = 0;
				
		while (true)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			
			if (a==0 && b==0)
				return;
			
			System.out.println(a+b);
		}
	}	
}
