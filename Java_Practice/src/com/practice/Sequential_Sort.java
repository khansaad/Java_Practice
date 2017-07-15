package com.practice;
	import java.util.*;
	
	class Sequential_Sort{

	public static void main(String args[])throws InputMismatchException{

	   Scanner scan=new Scanner(System.in);

	int n,i,j,t;

	    System.out.println("Enter the number of elements : ");
	       n=scan.nextInt();

	    int a[]=new int[n]; //declare array 

	    System.out.println("Enter "+n+" elements.");

	    for(i=0;i < n;i++) 
	    a[i]=scan.nextInt();

	    //sort the array in ascending order
	    for(i=0;i< n;i++){

	      for(j=i+1;j< n;j++){

	        if(a[i]>a[j]){

	        t=a[i];

	        a[i]=a[j];

	        a[j]=t;

	       }//end of if
	          }//end of inner loop
	    }//end of outer loop


	    //display the sorted array

	    System.out.println("Sorted Array : ");
	    
	    for(i=0;i< n;i++){

	    System.out.println(a[i]+" ");

	    }//end of loop

	   }//end of main
	}//end of class