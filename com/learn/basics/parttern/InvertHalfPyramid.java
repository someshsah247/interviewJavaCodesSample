package com.learn.basics.parttern;

public class InvertHalfPyramid {
	
	private static void printStrat(int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				//System.out.print("*");
				if(i<=j ) //for reverse
					System.out.print("*");				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printStrat(5, 5);
	}
}
