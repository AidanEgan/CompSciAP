import java.util.*;
public class apProblem {
	
	public static int arraySum(int[] arr) {
		return 0;
	}
	
	public static int[] rowSums(int[][] arr2D) {
		int[]sums = new int[arr2D.length];
		for(int i = 0; i < arr2D.length; i++) {
			for(int j = 0; j<arr2D[i].length;j++) {
				sums[i] += arr2D[i][j];
			}
		}
		return sums;
	}
	
	public static boolean isDiverse(int[][] arr2D) {
		for (int x = 0; x < rowSums(arr2D); x++) {
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		int exArr[][] = new int[(int)(Math.random()*100)][(int)(Math.random()*100)];
		for (int a = 0; a< exArr.length; a++) {
			for(int b = 0; b< exArr[a].length; b++) {
				exArr[a][b] = (int)(Math.random()*100);
			}
		}
		int sample[][] ={{1,3,2,7,3},{10,10,4,6,2},{5,3,5,9,6},{7,6,4,2,1}};
		for (int a = 0; a < rowSums(sample).length; a++) {
			System.out.println(rowSums(sample)[a]);
		}
	}
}
