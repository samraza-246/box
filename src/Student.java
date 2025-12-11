import java.util.Scanner;
public class Student
{
    public static void main(String[] args)
    {
        int rollno;
        String name;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rollno:");
        rollno=sc.nextInt();
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Student's rollno is" +rollno);
        System.out.println("Student's name" +name);
    }
}
