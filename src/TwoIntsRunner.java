import java.util.Scanner;
public class TwoIntsRunner 
{
	public static void main(String[] math)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int input1 = input.nextInt();
		int input2 = input.nextInt();
		TwoInts ints = new TwoInts(input1 ,input2);
		String arithmetic = ints.arithmetic();
		int larger = ints.larger();
		boolean isMultiple = ints.isMultiple();
		boolean isEven = ints.isEven();
		System.out.println(arithmetic);
		System.out.println(larger);
		System.out.println(isEven);
		System.out.println(isMultiple);
	}
}
