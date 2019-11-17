package Abc;

import java.util.Scanner;

public class LongestPalindromeString 
{ 

	static void Longest(String str) { 
		int n = str.length(); 

		boolean b[][] = new boolean[n][n]; 

		int max = 1; 
		for (int i = 0; i < n; ++i) 
			b[i][i] = true; 

		int start = 0; 
		for (int i = 0; i < n - 1; ++i) { 
			if (str.charAt(i) == str.charAt(i + 1)) { 
				b[i][i + 1] = true; 
				start = i; 
				max = 2; 
			} 
		} 
		
		for (int k = 3; k <= n; ++k) { 
			
			for (int i = 0; i < n - k + 1; ++i) 
			{ 
				int j = i + k - 1; 

				if (b[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) { 
					b[i][j] = true; 

					if (k > max) { 
						start = i; 
						max = k; 
					} 
				} 
			} 
		} 
		System.out.println(str.substring(start, start + max)); 
		
	
	} 

	public static void main(String[] args) { 

		Scanner o=new Scanner(System.in);
		String str=o.next();
		Longest(str); 
	} 
}