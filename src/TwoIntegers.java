
public class TwoIntegers
{
	private int num1;
	private int num2;
	public TwoIntegers()
	{
		this.num1 = 0;
		this.num2 = 0;
	}
	public TwoIntegers(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	public int getNum1()
	{
		return num1;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	public int getNum2()
	{
		return num2;
	}
	public String arithmetic()
	{
		String str = "\n" + "Sum is: " + (num1 + num2) + "\n";
		str += "Product is: " + (num1*num2) + "\n";
		str += "Difference is: " + (num1 - num2) + "\n";
		str += "Quotient is: " + (num1 / num2) + "\n";
		return str;
	}
	public String compare()
	{
		if(num1>num2)
		System.out.println (num1 + " is larger!\n");
		if(num1<num2)
		System.out.println (num2 + " is larger!\n");
		if (num1==num2)
		System.out.println ("These numbers are equal!\n");
		return null;
	}
}
