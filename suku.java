package first;
import java.util.*;
public class suku {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("...");
	}

}
