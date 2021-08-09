package baekjoon.level3.더하기_사이클;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// 입력받을 수 
		int x = sc.nextInt();
		sc.close();
		
		// 초기값 저장
		int a = x;
		
		// 사이클 카운트
		int cnt = 0;
		
		do
		{
			x = ((x%10)*10) + (((x/10) + (x%10))%10);
			//System.out.println(x);
			cnt++;
		} while (x != a);
		
		System.out.println(cnt);
	}
}
