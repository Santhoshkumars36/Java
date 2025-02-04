package demo;
import java.util.*;
public class factorial {

	public static void main(String[] args) 
	{
		int[]array= {76,55,39};
		int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
		{
				min=array[i];
			
		}
			
	}
		System.out.println(min);

}
}