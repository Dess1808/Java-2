//package problems;

import java.util.Scanner;

public class Vector {
	public static void main(String[] args) {
		//control variables
		int n;
		Scanner nInput = new Scanner(System.in);
		Scanner valueInput = new Scanner(System.in);
		
		//input
		System.out.println("Insira a quantidade de numeros: ");
		n = nInput.nextInt();
		
		//array created
		int[] arrayInt = new int[n];
		
	
		//input values
		for (int i = 0; i < n; i++) {
			System.out.print("Insira um valor:");
			arrayInt[i] = valueInput.nextInt();
		}
		
		//output revers 
		for (int i = n-1; i >= 0; i--) {
			System.out.println(arrayInt[i]);
		}
	}
}
