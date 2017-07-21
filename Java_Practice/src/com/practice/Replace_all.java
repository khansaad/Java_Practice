package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Replace_all {

	public static void main(String[]args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String:");
		String StringToModify = br.readLine();

		//Method 1: Using replaceAll method
		
		String ReplacedString = StringToModify.replaceAll("\\s", "");
		System.out.println(ReplacedString);
		
		//Method 2: Using append method
		
		char[] strArr = StringToModify.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<StringToModify.length();i++){
			if(strArr[i]!=' ' && strArr[i]!='\t')
				sb.append(strArr[i]);
		}
		System.out.println(sb);
	}
}
