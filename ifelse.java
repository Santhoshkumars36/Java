package addw;
import java.util.*;
public class ifelse {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n= scan.nextInt();
	    int sum=0,temp=n,c=0,a=n;
	    while(n>0) {	
	        n/=10;
	        c++;
	    }
	    while(temp>0) {
	    	int r= temp%10;
	    	sum=sum*10+r;
	    	sum+=Math.pow(r,c);
	    	temp/=10;
	    }
		if (a==sum) {
			System.out.println("Amstrong Number");
		}
		else {
			System.out.println("Not Amstrong Number");
		}
		
	}

}
