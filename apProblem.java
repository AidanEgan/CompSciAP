public class apProblem {
	
	public static void main(String[] args) {
		//Set up the different choices of arrays
		int exArr[][] = new int[(int)(Math.random()*50)][(int)(Math.random()*50)];
		for (int a = 0; a< exArr.length; a++) {
			for(int b = 0; b< exArr[a].length; b++) {
				exArr[a][b] = (int)(Math.random()*100);
			}
		}
		int mat1[][] ={{1,3,2,7,3},{10,10,4,6,2},{5,3,5,9,6},{7,6,4,2,1}};
		int mat2[][] ={{1,1,5,3,4},{12,7,6,1,9},{8,11,10,2,5},{3,2,3,0,6}};
		
		//Choose which array you want
		int choice[][] = exArr;
		
		//The actual code part
		for (int a = 0; a < rowSums(choice).length; a++) {
			System.out.println(rowSums(choice)[a]);
		}
		if(isDiverse(choice)){System.out.println("Array is diverse");}else{ System.out.println("Array is not diverse");}
	}
	
	public static int arraySum(int[] arr) {
		//Useless method that never gets called
		return 0;
	}
	
	public static int[] rowSums(int[][] arr2D) {
		int[] sums = new int[arr2D.length];
		for(int i = 0; i < arr2D.length; i++) {
			for(int j = 0; j<arr2D[i].length;j++) {
				sums[i] += arr2D[i][j];
			}
		}
		return sums;
	}
	
	public static boolean isDiverse(int[][] arr2D) {
		int[] sums = rowSums(arr2D);
		for (int x = 0; x < sums.length; x++) {
			for(int y = 0; y<sums.length; y++){
				if (x != y && sums[x] == sums[y]){
					return false;
				}
			}
		}
		return true;
	}
}
