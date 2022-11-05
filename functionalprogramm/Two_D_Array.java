package com.functionalprogramm;
import java.io.PrintWriter;
import java.util.Scanner;
public class Two_D_Array {

	public static int[][] arrayInt(int m,int n)
	{
		int arr[][]=new int[m][n];
		Scanner sc=new Scanner(System.in);    

		System.out.println("Input Array");

		for(int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
			{
				arr[i][j] = sc.nextInt();	
			} 
		}
		return arr;	
	}

	public static void display(int arr[][],int m,int n)
	{
		PrintWriter pw = new PrintWriter(System.out,true);

		System.out.println();
		pw.println("Output");

		for(int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
			{
				pw.print(" "+arr[i][j]+" ");
			} 
			pw.println();
		}

	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);      
		System.out.println("Enter number of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int n = sc.nextInt(); 

		int [][] arr  =arrayInt(m,n);
		display(arr,m,n);
	}
}
