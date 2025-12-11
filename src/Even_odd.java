import java.util.Scanner;
public class Even_odd {
    public static void main(String[] args)
    {
        int num;
        int even=0;
        int odd=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for(int i=1;i<=10;i++)
        {
            num=sc.nextInt();
            if (num % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Number of even numbers: "+even);
        System.out.println("Number of odd numbers: "+odd);
    }
}
