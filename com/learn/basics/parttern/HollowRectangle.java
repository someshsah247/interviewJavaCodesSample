package com.learn.basics.parttern;

public class HollowRectangle {

	private static void printStrat(int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				//System.out.print("*");
				if(i==0 || j==0 || j==col-1 || i==row-1)
					System.out.print("*");
				else
					System.out.print(" ");					
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printStrat(5, 5);
	}

}
