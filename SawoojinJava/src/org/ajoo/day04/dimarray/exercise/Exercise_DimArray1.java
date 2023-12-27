package org.ajoo.day04.dimarray.exercise;

public class Exercise_DimArray1 {

	public static void main(String[] args) {
		int arrs [][] = new int[5][5];
		int k = 1;
		for(int j = arrs.length; j > 0; j ++) {
			for(int i = arrs.length-1; i >=0 ; i -- ) {
				arrs[j][i] = k++;
			}
		}
		for(int j = 0; j < arrs.length; j ++) {
			for(int i = 0; i < arrs[j].length; i ++ ) {
				System.out.print(arrs[i][j] + " ");
			}
		}
	}

}
