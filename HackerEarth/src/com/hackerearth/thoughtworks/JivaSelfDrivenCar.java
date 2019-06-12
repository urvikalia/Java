package com.hackerearth.thoughtworks;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author urvi
 * reference : https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/jiva-the-self-driven-car/
 * 
 *
 */
public class JivaSelfDrivenCar {

	private int T;
	private int M;
	private int N;
	private ArrayList<int []> journey = new ArrayList<>();
	int [][] matrix=null;
	
	
	/**
	 * Input validations can be added
	 * In this case assuming everything is fine
	 */
	private void populateInput()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Kindly input parameters for Jiva");
		String str1=scanner.nextLine();
		T=Integer.valueOf(str1.trim());
		String [] variables=scanner.nextLine().split(" ");
		N=Integer.valueOf(variables[0]);
		M=Integer.valueOf(variables[1]);
		
		matrix =new int [N][10];
		for(int i=0;i<N;i++)
		{
			String [] startEnd=scanner.nextLine().split(" ");
			int start=Integer.valueOf(startEnd[0]);
			int end=Integer.valueOf(startEnd[1]);
			for(int j=start;j<end;j++)
			{
				matrix[i][j]=1;
			}
				
		}
		
		scanner.close();
	}
	private void printMatrix()
	{
		int rows=matrix.length;
		int columns=matrix[0].length;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
				System.out.print(matrix[i][j]+ " ");
			System.out.println();
		}
	}
	
	private void computeTravelerPerKm()
	{
		int rows=matrix.length;
		int columns=matrix[0].length;
		int []summation =new int[columns];
		
		for(int col=0;col<columns;col++)
		{
			int sum=0;
			for(int row=0;row<rows;row++)
			{
				sum=sum+ matrix[row][col];
			}
			summation[col]=sum;
		}
		System.out.println("Printing results:");
		for(int i=0;i<columns;i++)
			System.out.print(summation[i] + " ");
	}
	public static void main(String[] args) {
	
		 JivaSelfDrivenCar car=new JivaSelfDrivenCar();
		 car.populateInput();
		 car.printMatrix();
		 car.computeTravelerPerKm();
	}
}
