package baekjoon.level5.최댓값;

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
		
		int max = Integer.parseInt(br.readLine());
		int cnt = 0;
		int arr[] = new int[9];
		arr[0] = max;
		
		for (int i = 1; i < 9; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
			
			if (max < arr[i])
			{
				max = arr[i];
				cnt = i;
			}
		}
		
		bw.write(max + "\n" + (cnt+1));
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
