package baekjoon.level5.OX퀴즈;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		int cnt;	// 연속 횟수
		int sum;	// 누적 합
		
		for (int i = 0; i < arr.length; i++)
			arr[i] = br.readLine();
		
		for (int i = 0; i < arr.length; i++)
		{	
			cnt = 0;
			sum = 0;
			
			for (int j = 0; j < arr[i].length(); j++)
			{
				if (arr[i].charAt(j)=='O')
					cnt++;
				else
					cnt=0;
				
				sum += cnt;
			}
			
			bw.write(sum + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();		
	}
}
