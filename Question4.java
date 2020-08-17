package Cipher;
import java.util.*;
class Circle
{
	double rad=1.0;
	String color="red";
	Circle()
	{}
	Circle(double rad)
	{
		this.rad=rad;
	}
	double getRad()
	{
		return rad;
	}
	double getArea()
	{
		return Math.PI*(Math.pow(rad, 2));
	}
}

public class Question4 {

	public static void main(String[] args) {
		Circle obj=new Circle(12);
		System.out.println(obj.getRad());
		System.out.println(obj.getArea());
		

	}

}
