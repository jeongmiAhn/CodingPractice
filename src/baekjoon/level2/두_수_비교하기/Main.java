package baekjoon.level2.두_수_비교하기;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b)
			System.out.println(">");
		else if (b > a)
			System.out.println("<");
		else
			System.out.println("==");
	}
}
