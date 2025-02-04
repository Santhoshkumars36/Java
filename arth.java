package addw;

public class arth {
   public static void main(String[] args) {
	   int a=8;
	   int b=12;
	   int c= 7;
	   a=a++ - --b + c++;
	   b/=c;
	   b=c-- - --a + ++b;
	   System.out.println(a<b && c==a);
	   System.out.println(a%3==0 ? c-- : --b);
	   a*=b;
	   int e=a/3*b;
	   System.out.println(e);
	   System.out.println(e<c ? c%4 : b-a);
	   System.out.println(! (a<b || c==e));
	   int d=e++;
	   System.out.println(d);
	   System.out.println(a+" "+b+" "+c+" "+d+" "+e);
	   
	   
   }
}
