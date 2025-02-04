package demo;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=num;i>=1;i=num/10)
		{
		 num= num%10;
		num=num/10;
		}
		System.out.println(num);
	}

}
