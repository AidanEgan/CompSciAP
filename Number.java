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
		System.out.println(toReverse);
		if(toReverse <10) {
			return 0;
		}
		while(digitNum != 0) {
			System.out.println("Right here");
			reversedNum += (int)((toReverse%10)*(Math.pow(10, (digitNum-1))));
			System.out.println(reversedNum);
			toReverse = toReverse/10;
			digitNum -=1;
		}
		return reversedNum;
	}
	public void reverseME() {
		//same algrorithm changes the num itself
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
	
	public static void main (String args[]) {
		Number n = new Number(358);
		System.out.println(n.reverse());
	}
}
