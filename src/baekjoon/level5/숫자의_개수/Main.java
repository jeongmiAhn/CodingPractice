package baekjoon.level5.숫자의_개수;

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
		
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int n3 = Integer.parseInt(br.readLine());
		
		int n = n1 * n2 * n3;
		String result = String.valueOf(n);
		String[] arr = result.split("");

		int cnt;
		
		for (int i = 0; i < 10; i++)
		{
			cnt = 0;
			
			for (int j = 0; j < arr.length; j++)
			{
				if (Integer.parseInt(arr[j])==i)
					cnt++;
			}
			
			bw.write(cnt + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
