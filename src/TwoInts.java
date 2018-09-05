
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
		return (one + " + " + two + " = " + (one + two) + ", " + one + " % " + two + " = " + (one % two) + ", " + one + " * " + two + " = " + (one * two) + ", " + one + " / " + two + " = " + ( (double) one / two));
	}
	public int larger()
	{
		if (one > two)
		{
			return one;
		}
		else if (two > one)
		{
			return two;
		}
		else
		{
			return one;
		}
	}
	public boolean isEven()
	{
		int var = one + two;
		if (var % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isMultiple()
	{
		if (one % two == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
