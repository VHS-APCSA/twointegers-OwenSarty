import java.util.Scanner;

public class TwoIntegersRunner
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.print("First Integer;");
		int num1 = input.nextInt();
		System.out.print("\n" + "Second Integer;");
		int num2 = input.nextInt();
		TwoIntegers arithmetic = new TwoIntegers(num1, num2);
		System.out.println(arithmetic.arithmetic());
		String compare = arithmetic.compare();
		System.out.print(compare);
		Boolean oddOrEven = arithmetic.oddOrEven();
		System.out.print("Integer 1 is even: " + oddOrEven + "\n");
		Boolean multiples = arithmetic.multiples();
		System.out.print("Integer 1 is a multiple of integer 2 = " + multiples);
	}

}
