package Cipher;
import java.util.*;
class Trinangle{
	int a,b,c;
	public Trinangle(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	double Area()
	{
		int s=(a+b+c)/2;
		double r=Math.sqrt(s*(s-a)*(s-b)*(s-b));
		return r;
	}
}
public class Question7 {

	public static void main(String[] args) {
		Trinangle obj=new Trinangle(10, 20, 30);
		System.out.println(obj.Area());
				

	}

}
