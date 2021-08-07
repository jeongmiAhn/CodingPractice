package baekjoon.level3.A_B_4;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a, b = 0;
		
		// eof 처리
		while (sc.hasNextInt())
		{
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println(a+b);
		}
		
		sc.close();
	}
}
