package com.practice;

import java.util.Scanner;

public class FirstOccurance {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Eneter any String");
		String str = scan.nextLine();
		//StringBuffer str = new StringBuffer(scan.nextLine());
		String finalString = str;
		char firstRepeatedCharacter = getFirstOccuranceOfNonRepeatedCharacter(str, finalString);
		System.out.println("The first non repeated character is : "+firstRepeatedCharacter);

	}

	private static char getFirstOccuranceOfNonRepeatedCharacter(String str, String finalString) {
		int count = 0;
		int indexOfFirstOccuranceOfNonRepeated = 0;
		char[]arr = str.toCharArray();
		for(int i=0; i<str.length(); i++)
		{
			count = 0;
			for(int j=i+1;j<str.length()-1;j++)
			{
				if(arr[i]==arr[j] && arr[j]!=' ' && arr[i]!=' ')
				{
					count++;					
					arr[j]=' ';
				}
			 }
			
			if(arr[i]!=' ' && count==0)
			 {
				indexOfFirstOccuranceOfNonRepeated = i;							
				break;
			}
		}
		
		return finalString.charAt(indexOfFirstOccuranceOfNonRepeated);
	}

}
