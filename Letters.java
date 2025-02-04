package training;
public class Letters {
	public static void main(String[]args)
	{
		int n=4;
		for(int i=n-1;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
