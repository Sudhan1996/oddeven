package hello;
import java.util.Scanner;
public class oddeven {
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int s = in.nextInt();
		if(s%2==0)
		{
				System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}

	}

}
