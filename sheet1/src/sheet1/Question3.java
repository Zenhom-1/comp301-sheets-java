package sheet1;
import java.util.Scanner;
public class Question3
{
    public static void q3main()
    {
        Scanner in = new Scanner(System.in);
        int Base,Exponent,result = 1;
        System.out.print("Please Enter Base: ");
        Base = in.nextInt();
        System.out.print("Please Enter Exponent: ");
        Exponent = in.nextInt();
        for (int i = 1; i <= Exponent; i++) 
        {
            result *=Base;
        }
        System.out.println("The power of the exponent: " + result);
    }
}
