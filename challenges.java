
public class challenges {
	public static void main(String[] args) {
		int[] randArr = new int[(int) (Math.random()*500)];
		for (int x = 0; x < randArr.length; x++) {
			randArr[x] = (int)(Math.random() * 100);
		}
		
		int[][] primesTest = new int[(int)((Math.random()*3)+4)][(int)((Math.random()*3)+4)];
		
		
		
		System.out.println(linearSearch(randArr, 8));
		System.out.println(majMatrixPrimes(primesTest));
	}
	public static int linearSearch(int[] arr, int search) {
		boolean found = false;
		int i = 0;
		while(!found && (i != (arr.length-1))) {
			if(arr[i] == search) {
				found = true;
				return i;
			}
			i++;
		}
		System.out.println("The number you are looking for does not exist");
		return 0;
	}
	public static boolean isPrime(int prime) {
		for(int i = 2; i < 10; i++) {
			if(prime%i == 0) {
				return true;
			}
		}
		return false;
	}
	public static boolean majMatrixPrimes(int[][] mat) {
		boolean returns = false;
		int count = 0;
		int i = 0;
		int j = 0;
		while((i < mat.length) && (!returns)) {
			while((j < mat[i].length) && (!returns)) {
				if (isPrime(mat[i][j])) { count++; }
				if (count > (mat.length * mat[i].length)) { returns = true; }
				j++;
			}
			i++;
		}
		return returns;
	}
	
	
}
