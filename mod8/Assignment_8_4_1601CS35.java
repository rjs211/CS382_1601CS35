import java.util.*;
class Employee
{
    String name;
    int age;
    String salary;
    public String toString()
    {
        return "Name: "+name+" Age: "+age+" Salary: "+salary;
    }

}
public class Assignment_8_4_1601CS35{

    public static void main(String[] args)
    {   Scanner in = new Scanner(System.in);
        Employee obj1 = new Employee();
        System.out.println("Enter name , age and salary of employee 1");
        obj1.name = in.nextLine();
        obj1.age = in.nextInt();
        in.nextLine();
        obj1.salary = in.nextLine();
        System.out.println("After implementing toString:");
        System.out.println(obj1.toString());




    }

}
