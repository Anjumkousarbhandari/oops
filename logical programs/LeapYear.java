import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		System.out.println("Enter any year");
		
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();
		
		if (year%4 ==0) 
			System.out.println("This year is leap year");
			
			else
				
			System.out.println("This year is not a leap year");
		}
			
	}


