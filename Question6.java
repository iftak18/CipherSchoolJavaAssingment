package Cipher;
import java.util.*;

class Employee{
	String name, joinDate, address;
	int salary;
	Employee(String name,String joinDate,String address)
	{
		this.name=name;
		this.joinDate=joinDate;
		this.address=address;
	}
	String DiplayInfo()
	{
		return name+"\t"+joinDate+"\t"+address;
	}
}
public class Question6 {

	public static void main(String[] args) {
		
		ArrayList<Employee> ls=new ArrayList<>();
		ls.add(new Employee("Name", "Date of Joining","Address" ));
		ls.add(new Employee("John", "15-08-2020","88E-Ghy" ));
		ls.add(new Employee("Mike", "17-06-2012","35B-Pun" ));
		ls.add(new Employee("Jake", "15-08-2020","22j-Del" ));
		for (Employee e : ls) {
			System.out.println(e.DiplayInfo());
			
		}
		

	}

}
