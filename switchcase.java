package demo;
import java.util.*;
public class switchcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     String a=sc.nextLine();
	     switch(a)
	     {
	     case "IT":
	    	 System.out.println("Ours Dept HOD is Ramesh");
	    	 break;
	    	 
	     case "CSE":
	    	 System.out.println("Ours Dept HOD is Gogul");
	    	 break;
	     case "ECE":
	    		 System.out.println("Ours Dept HOD is Raj");
		    	 break;
		  case "EEE":
			    System.out.println("Ours Dept HOD is satti");
			    	 break;
		 default:
			System.out.println("Enter a valid Department");
			 break;
	     }
		

	}

}
