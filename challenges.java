import java.util.Scanner;
public class challenges {
	public static void main(String[] args) {
		int[] randArr = new int[(int) (Math.random()*500)];
		for (int x = 0; x < randArr.length; x++) {
			randArr[x] = (int)(Math.random() * 100);
		}
		int size = (int)((Math.random()*3)+4);
		int[][] primesTest = new int[size][size];
		
		for (int[] x : primesTest){
			for (int y = 0; y< x.length; y++){
				x[y] = (int)(Math.random()*100);
			}
		}
		
		char[] charArr = new char[(int)(Math.random()*50)];
		for (int a = 0; a < charArr.length; a++){
			//(char)(Math.random()*25 + 65)
			charArr[a] = (char)(Math.random()*25 + 65);
		}
		
		//Find the target value
		System.out.println(linearSearch(randArr, 8));
		//Find if there is a majority primes
		System.out.println(majMatrixPrimes(primesTest));
		/*Find if inputed word is a palindrome 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		System.out.println(isPalindrome(in.nextLine()));
		in.close();*/
		System.out.println("hi");
		System.out.println(gcd(10,10));
		
		System.out.println();
		
		for(int i : lastFive(charArr)){
			System.out.print(i + " ");
		}
		
	}
	public static int linearSearch(int[] arr, int search) {
		boolean found = false;
		int i = 0;
		while(!found && (i < (arr.length-1))) {
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
		if (prime ==2){ return true;}
		for(int i = 2; i < 10; i++) {
			if(i != prime && prime%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean majMatrixPrimes(int[][] mat) {
		boolean returns = false;
		int count = 0;
		int i = 0;
		int j = 0;
		while((i < mat.length) && (!returns)) {
			j = 0;
			while((j < mat[i].length) && (!returns)) {
				if (isPrime(mat[i][j])) { count++; }
				if (count > ((mat.length * mat.length)/2)) { returns = true; }
				j++;
			}
			i++;
		}
		return returns;
	}
	
	public static int[] lastFive(char[] cArr){
		int quota = 0;
		int inc = cArr.length -1;
		int[] returns = new int[5];
		while(quota<5 && inc > 0){
			if(isVowel(cArr[inc])){
				returns[4-quota] = inc; quota++;
			}
			inc--;
		}
		return returns;
	}
	
	public static boolean isVowel(char ch){
		char[] voweList = {'A','E','I','O','U'};
		for (char a : voweList){
			if (a == ch) {return true;}
		}
		return false;
	}
	
	
	public static int gcd(int in1, int in2){
		int a = (in1>in2) ? in1 : in2;
		int b = (in1>in2) ? in2 : in1;
		int count = 1;
		while(count <= Math.ceil(b/2)){
			if ((a%((double)b/count)==0)){
				return (b/count);
			}
			count++;
		}
		return 1;
	}
	
	public static boolean isPalindrome(String myString){
		char[] str = myString.toCharArray();
		for(int a = 0; a < Math.ceil(str.length/2); a++){
			if (str[a] != str[str.length-1-a]){return false;}
		}
		return true;
	}
	
	
}
