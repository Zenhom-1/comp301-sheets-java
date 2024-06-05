package sheet1;
import java.util.Scanner;
public class Question5
{
    public static void q5main()
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Please Enter The Number Of Fibonacci: ");
        n = in.nextInt();
        if (n < 1)
        {
            System.out.println("Only Positive Value");
        }
        else
        {
            int []fib = new int[10];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i < n; i++) 
            {
                fib[i] = fib[i-1] + fib[i-2];
            }
             for (int i = 0; i < n; i++) 
            {
                System.out.println("fib[" + (i + 1) + "] = " + fib[i]);
            }
        }
    }
}
