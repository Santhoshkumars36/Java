package suguu;
class Anu{
	private String hobbies;
	private int age;

public String gethobbies() {
    return hobbies;
}
public void setHobbies(String hobbies) {
	this.hobbies=hobbies;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age>0) {
		this.age=age;
		
	}else {
		System.out.println("incorrect age");
	}
}
}
public class RRR  {
	public static void main(String[] args) {
		 Anu l=new Anu();
		 l.setHobbies("dfs");
		 l.setAge(22);
		 System.out.println(l.gethobbies());
		 System.out.println(l.getAge());
		 
	}
}
