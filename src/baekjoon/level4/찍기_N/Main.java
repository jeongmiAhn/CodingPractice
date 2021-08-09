package baekjoon.level4.찍기_N;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		int cnt = n;
		
		for (int i = 0; i < cnt; i++)
		{
			System.out.println(n);
			n--;
		}
	}
}
