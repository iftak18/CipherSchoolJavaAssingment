package Cipher;
import java.util.*;
import java.util.stream.Collectors;

class Emp {
    int Id, Salary;
    String Name, Desg, location;

    public Emp(int Id, int Salary, String Name, String Desg, String location) {
        this.Id = Id;
        this.Salary = Salary;
        this.Name = Name;
        this.Desg = Desg;
        this.location = location;
    }
    void setName(String Name)
    {
    	this.Name=Name;
    }

    String getName() {
        return Name;
    }

    int getSalary() {
        return this.Salary;
    }

    void setSalary(int Salary) {
        this.Salary = Salary;
    }

    String getDesg() {
        return this.Desg;
    }

    public void setDesg(String Desg) {
        this.Desg = Desg;
    }

} 
public class Question3 {
    public static void main(String[] args) {

        ArrayList<Emp> list = new ArrayList<>();

        list.add(new Emp(1, 78000, "John", "CEO", "Punajab"));
        list.add(new Emp(2, 65000, "Gary", "HR", "Delhi"));
        list.add(new Emp(3, 55000, "Josef", "Manager", "Kolkata"));
        list.add(new Emp(4, 52000, "Adeel", "Java Developer", "Jorhat"));
        list.add(new Emp(5, 52000, "Shrek", "Web Developer", "Guwahati"));
        list.add(new Emp(6, 40000, "Aman", "System Engineer", "Nagapur"));
        list.add(new Emp(7, 35000, "Zayn", "Analyst", "Kalyan"));
        list.add(new Emp(8, 27000, "Michael", "Trainee", "Patna"));
        list.add(new Emp(9, 20000, "Koala", "IT Support", "Jalandhar"));
        list.add(new Emp(10, 18000, "Sean", "Intern", "Jammu"));
        System.out.println("Employee names:");
        List<String> names = list.stream().map(emp -> emp.Name).collect(Collectors.toList());
        names.forEach(System.out::println);
        System.out.println();
        System.out.println("Salary more than 50000 :");
        List<Integer> salaries = list.stream().filter(emp -> emp.getSalary() > 50000).map(emp -> emp.getSalary())
                .collect(Collectors.toList());
        salaries.forEach(System.out::println);
        System.out.println();
        System.out.println("Name Starting with 'M':");
        List<String> nameM = list.stream().filter(emp -> emp.getName().startsWith("M"))
                .map(emp -> emp.getName()).collect(Collectors.toList());
        nameM.forEach(System.out::println);
        System.out.println();
        System.out.println("Designation ending with 'E:");
        List<String> desg = list.stream().filter(emp -> emp.getDesg().endsWith("e"))
                .map(emp -> emp.getDesg()).collect(Collectors.toList());
        desg.forEach(System.out::println);
    }
}
