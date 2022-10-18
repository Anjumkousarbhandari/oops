import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		int head=0;
		int tail=0;
		
		for (int i =0; i< count; i++){
			double flip = Math.random();
			if (flip>0.5)
				head++;
			else
				tail++;
	}
		System.out.println(head);
		System.out.println(tail);
		
		float headPercentage=(head*100)/count;
		float tailPercentage=(tail*100)/count;
		
		System.out.println("heads percentage"+ headPercentage);
		System.out.println("tails percentage"+ tailPercentage);
		}
	}
