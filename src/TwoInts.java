
public class TwoInts 
{
	private int one;
	private int two;
	
	public TwoInts ()
	{
		one = 3;
		two = 5;
	}
	
	public String arithmetic()
	{
		return (one + " + " + two + " = " + (one + two) + ", " + one + " % " + two + " = " + (one % two) + ", " + one + " * " + two + " = " + (one * two) + ", " + one + " / " + two + " = " + (one / two));
	}
}
