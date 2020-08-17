package Cipher;
import java.util.*;
class Rect{
	int h,w;
	 void dispaly()
	 {
		 System.out.println("Height="+h+"Width="+w);
	 }
	
}
class RectArea extends Rect{
	void set()
	{
		Scanner sc=new Scanner(System.in);
		h=sc.nextInt();
		w=sc.nextInt();
		
	}
	void get()
	{
		super.dispaly();
		System.out.println("Area of the rectangle "+(h*w));
		
	}
	
}
public class Question2 {

	public static void main(String[] args) {
		RectArea obj=new RectArea();
		obj.set();
		obj.get();

	}

}
