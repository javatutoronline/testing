
public class Factorial 
{
	public static int factorial(int n) 
	{
		if (n != 0) // ending condition
			return n * factorial(n - 1); // recursive call
		else
			return 1;
	}

	public static void main(String[] args) 
	{
		int num=7;
		int fact=factorial(num);
		System.out.println("Factorial of the number "+num+" is "+fact);
	}

}
