import java.util.Scanner;

public class hourlyWage {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("What's your name? ");
		String name = input.nextLine();
		System.out.println("What is your hourly wage? ");
		double wage = input.nextDouble();
		System.out.println("How many hours have you worked in the last week? ");
		double hours = input.nextDouble();
		System.out.println("Please input overtime hours worked. ");
		double overTime = input.nextDouble();
		input.close();
		double totalMoney = (wage*hours) + (1.5*wage*overTime);
		System.out.println(name + " has made " + totalMoney + " dollars this week from working.");
	}
}
