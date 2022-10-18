import java.util.Scanner;

public class HarmonicSeries {
	public static void main(String[] args) {
		
		System.out.println("Enter any number:");
		Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Harmonic Series is:");
		double output = 0.0;
		while(num>0) {
			
			output= output + (double)1/num;
			num--;
			System.out.println(output+" ");
		}
		System.out.println(" ");
		System.out.println(" output of Harmonic seriese is" + output);
	}
	

}
