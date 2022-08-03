package newww;

public class normal 
{

	public static void throwavle(int a)
	{
		if(a<10)
		{
			throw new ArithmeticException("Not valid");
		}
		else
		{
			System.out.println("Result is: "+a);
		}
	}
	
}
