package baekjoon.level4.X보다_작은_수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// n 과 x 
		String s1 = br.readLine();
		String arr[] = s1.split(" ");
		
		// n 개의 수열
		String s2 = br.readLine();
		String arr2[] = s2.split(" ");
		
		br.close();
		
		// arr[0]=n, arr[1]=x
		for (int i = 0; i < Integer.parseInt(arr[0]); i++)
		{
			if (Integer.parseInt(arr[1]) > Integer.parseInt(arr2[i]))
				bw.write(Integer.parseInt(arr2[i]) + " ");
		}
		
		bw.flush();
		bw.close();
	}
}
