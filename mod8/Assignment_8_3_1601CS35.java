import java.util.*;
class Employee
{
    String name;
    int age;
    String salary;
    boolean equals(Employee obj2)
    {   
        if(this.salary.equals(obj2.salary))
        {
            return true;
        }
        else {
            return false;
        }
    }

}
public class Assignment_8_3_1601CS35
{

    public static void main(String[] args)
    {   Scanner in = new Scanner(System.in);
        Employee obj1 = new Employee();
        Employee obj2 = new Employee();
        System.out.print("Enter name , age and salary of First employee: ");
        obj1.name = in.nextLine();
        obj1.age = in.nextInt();
        in.nextLine();
        obj1.salary = in.nextLine();
        System.out.print("Enter name , age and salary of Secodn employee: ");
        obj2.name = in.nextLine();
        obj2.age = in.nextInt();
        in.nextLine();
        obj2.salary = in.nextLine();
        System.out.println(obj1.equals(obj2));



    }

}
