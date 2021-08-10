package baekjoon.level4.A_B_4;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 개수 
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #" + (i+1) + ": " + (a+b));
		}
		
		sc.close();
	}
}
