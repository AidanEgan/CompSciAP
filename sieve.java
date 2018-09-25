import java.util.*;

public class sieve {
	
	public static ArrayList<Integer> sieves(int limit){
		boolean[] allNums = new boolean[limit-1];
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = 0; i<(limit-1); i++){
			allNums[i] = true;
		}
		for (int x = 1; x <= (int)Math.ceil(Math.sqrt(limit)); x++){
			if (allNums[x-1]){
				for (int y=2; y < (int)(Math.ceil(limit/(x+1))+1); y++){
					allNums[((x+1)*(y))-2] = false;
				}
			}
		}
		for (int c = 0; c<(limit-2); c++){
			if (allNums[c]){
				primes.add(c+2);
			}
		}
		return primes;
	}
	
	public static int binarySearch(ArrayList<Integer> arr, int test, int max, int min){
		int guess = (int)Math.floor((max + min)/2);
		if (test == arr.get(guess)){
			System.out.println(test + " is the " + (guess+1) + " prime number in this list.");
			return 0; }
		else if (max - min == 1){
			System.out.println(test + " is not a prime number.");
			return 0;}  
		if (arr.get(guess) < test){
			binarySearch(arr, test, max, guess);
		} else {
			binarySearch(arr, test, guess, min);
		}
		return 0;
	}
	
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		int sieveLimit = 100000000; // One hundred million
		int testPrime = 5001923;
		ArrayList<Integer> siv = new ArrayList<Integer>();
		siv = sieves(sieveLimit);
		System.out.println("There are " + siv.size() + " prime numbers less than " + sieveLimit);
		long stopTime = System.currentTimeMillis();
	    double elapsedTime = stopTime - startTime;
	    System.out.println("That took me " + elapsedTime/1000 + " seconds.");
		binarySearch(siv,testPrime,siv.size(),0);
	}
}
