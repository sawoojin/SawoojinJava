package org.ajoo.day04.dimarray.exercise;

public class Exercise_DimArray03 {

	public static void main(String[] args) {
		int nums [][] = new int[5][5];
		int k = 1;
		for(int i = 0; i < nums.length; i ++) {
			for(int j = 0; j < nums.length; j ++)
			nums[i][j] = k ++;
		}

		for(int j = 0; j < nums.length; j ++) {
			for(int i = 0; i < nums[j].length; i ++ ) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}

}
