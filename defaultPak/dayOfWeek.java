package defaultPak;

import java.util.*;
import java.util.regex.*;

public class dayOfWeek {
	public static void main(String[] args){
		//Get the input from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Print your date of birth (MM/DD/YYYY):");
		String birthday = input.nextLine();
		input.close();
		
		//Format it using regex
		List<String> birthdayFormat = new ArrayList<>();
		Matcher m = Pattern.compile("(\\d+)").matcher(birthday);
	 		while (m.find()) {
	 			birthdayFormat.add(m.group());
	 		}
	 		
		//Use the calendar object to find the day of the week
		String[] weekDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saturday" };
		Calendar cal = Calendar.getInstance();
		//cal.set(YYYY/MM/DD);
		cal.set(Integer.parseInt(birthdayFormat.get(2)), Integer.parseInt(birthdayFormat.get(0))-1, Integer.parseInt(birthdayFormat.get(1)));
		System.out.print("You were born on a " + weekDays[cal.get(Calendar.DAY_OF_WEEK) - 1]);
	}
}

