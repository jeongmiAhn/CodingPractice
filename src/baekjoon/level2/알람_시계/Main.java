package baekjoon.level2.알람_시계;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int h = 0;
		int m = 0;
		
		h = sc.nextInt();
		m = sc.nextInt();
		
		if (m>=45 && m<=59)
		{
			m -= 45;
			
			System.out.println(h + " " + m);
		}
		else if (m<45 && m>=0)
		{
			if (h == 0)
				h = 23;
			else
				h -= 1;
			
			m += 15;
			
			System.out.println(h + " " + m);
		}
	}
}
