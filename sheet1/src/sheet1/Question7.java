package sheet1;
import java.util.Scanner;
public class Question7 
{
    public static void q7main()
    {
        Scanner in = new Scanner(System.in);
        int start,end,flag;
        System.out.print("Please Enter of The Start Interval: ");
        start = in.nextInt();
        System.out.print("Please Enter The End Interval: ");
        end = in.nextInt();
        System.out.print("The Prime Number: ");
        if(start == 1) 
            start++;
         for (int i = start; i <= end; i++)
            {
                flag = 0;
                for (int j = 2; j < Math.sqrt(i); j++) 
                {
                    if(i%j==0)
                    {
                        flag++;
                    }
                }
                if(flag == 0)
                {
                    System.out.print(" " + i);
                }
            }
    }
}
