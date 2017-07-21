package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_Reverse {
	
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String:");
		String S = br.readLine();
		
		//Method 1: Using String Buffer
		
		StringBuffer sbf = new StringBuffer(S);
		System.out.println(sbf.reverse());
		
		//Method 2: Using Iteration
		
		char[] strArr = S.toCharArray();
		for(int i=S.length()-1;i>=0;i--){
			System.out.print(strArr[i]);
		}
		
		//Method 3: Using Recursion
		
		System.out.println(recursiveMethod(S));
	}//eom

	private static String recursiveMethod(String str) {
	
		if(str==null||str.length()<=1)
			return str;
		else
			return recursiveMethod(str.substring(1))+str.charAt(0);
	}

}//eoc
