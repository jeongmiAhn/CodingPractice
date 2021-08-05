package baekjoon.level2.사분면_고르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x, y = 0;
		
		do
		{
			x = Integer.parseInt(br.readLine());
		} while (x<-1000 || x>1000 || x==0);
		
		do
		{
			y = Integer.parseInt(br.readLine());
		} while (x<-1000 || x>1000 || x==0);
		
		if (x>0 && y>0)
			System.out.println("1");
		else if (x<0 && y>0)
			System.out.println("2");
		else if (x<0 && y<0)
			System.out.println("3");
		else if (x>0 && y<0)
			System.out.println("4");
	}
}
