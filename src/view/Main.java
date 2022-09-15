package view;

import controller.RanThread;

public class Main {

	public static void main(String[] args) {
		
		int[][] matrix = generate();
		RanThread[] mThreads = new RanThread[3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				mThreads[i] = new RanThread(matrix[i][j],i);
				mThreads[i].start();
			}
		}

	}
	
	public static int[][] generate() {
		int[][] matrix = new int[3][5];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				matrix[i][j] = (int) (Math.random() * 100);
			}
		}
		
		return matrix;
	}

}
