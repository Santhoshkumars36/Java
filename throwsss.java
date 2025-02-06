package exphandling;
import java.util.*;
class abi extends Exception{
	abi(){
		super ("zzzzzz");
	}
	abi(String s){
		super(s);
	}
}
public class throwsss {
	static void validate(int age)throws abi{
		if(age<18) {
			throw new abi();
			
		}else {
			System.out.println("validate age");
		}
	}
  public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  int age=scan.nextInt();
	  try {
		  validate(age);
	  }catch(abi a) {
		  System.out.println(a.getMessage());
	  }
  }
}