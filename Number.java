public class Number {
	private int num;
	public Number() {
		num = 20;
	};
	public Number(int c) {
		num = c;
	};
	
	public int reverse() {
		//for a num of more than one digit, it creates a new number with digits in reverse order
		int digitNum = this.countDigits();
		int toReverse = num;
		int reversedNum = 0;
		while(digitNum != 0) {
			reversedNum += (int)((toReverse%10)*(Math.pow(10, (digitNum-1))));
			toReverse = toReverse/10;
			digitNum -=1;
		}
		return reversedNum;
	}
	public void reverseME() {
		//same algrorithm changes the num itself
		num = this.reverse();
	}
	public int countDigits() {
		//for a num of more than one digit, it returns a count of the number of digits. i.e. 14,235 has 5 digits
		int digits = 1;
		int holder = num;
		while((holder/10) != 0) {
			digits +=1;
			holder = holder/10;
		}
		return digits;
	}
	public void format(int accuracy) {
		String returner = Integer.toString(num) + ".";
		
		//prints num with accuracy places after decimal
		for(int i = 0; i <accuracy; i++) {
			returner += "0";
		}
		System.out.println(returner);
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int n) {
		num = n;
	}
	public boolean isPalindrome(){
		return (num == this.reverse());
	}
	public boolean isPerfect(){
		int testPerf = 1;
		for(int i = 2; i<Math.ceil(Math.sqrt(num)); i++){
			if (num%i == 0){
				testPerf += i;
				testPerf += (num/i);
			}
			
		}
		if(testPerf == num){
			return true;
		}
		return false; 
	}
	
	public static void main (String args[]) {
		Number n = new Number(1337);
		Number n2 = new Number(1234321);
		System.out.println(n.getNum());
		System.out.println(n2.reverse());
		System.out.println(n.isPalindrome());
		n.setNum(28);
		System.out.println(n.isPerfect());
		
	}
}
