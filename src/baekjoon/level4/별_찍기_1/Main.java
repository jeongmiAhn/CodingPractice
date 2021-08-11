package baekjoon.level4.별_찍기_1;

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
		String star = "";
		
		for (int i = 0; i < n; i++)
		{
			star += "*";
			
			bw.write(star + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
