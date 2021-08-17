package baekjoon.level5.나머지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Integer> h = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++)
			h.add(Integer.parseInt(br.readLine()));
		
		System.out.println(h.size());
	}
}
