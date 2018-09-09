import java.util.*;
public class gradeFinder {
	public static void main(String[] args){
		char gradeArray[] = new char[]{'E','D','C','B','A'};
		char gradeAppend[] = new char[]{'-',' ','+'};
		Scanner input = new Scanner(System.in);
		System.out.println("What is your number grade? ");
		double grade = input.nextDouble();
		input.close();
		if (grade > 99){
			grade = 99;
		}
		int newGrade = (int)((grade/10)-5);
		int newAppend = (int)(Math.ceil((grade%10)/3)-1);
		if (Math.floor(grade/10) < 6){
			newGrade = 0;
			newAppend = 1;
		} else if(newGrade == 4 && newAppend == 2){
			newAppend = 1;
		}
		System.out.println("Your letter grade is " + gradeArray[newGrade] + gradeAppend[newAppend]);
	}
}
