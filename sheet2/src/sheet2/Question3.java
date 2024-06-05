package sheet2;
public class Question3
{
    public static void pattern1(int x)
    {
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char)('A' + i) + " ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int x)
    {
        for (int i = 0; i < x; i++)
        {
            for(int j = 0;j <= (x-i-1)*2;j++)
            {
                System.out.print(" ");
            }
             for(int j = 1;j <= i+1;j++)
            {
                System.out.print((j+i) + " ");
            }
            if(i > 0)
            {
                for (int j = i; j >= 1; j--) 
                {
                    System.out.print((j+i) + " ");
                }
            }
            System.out.println();
        }
        
       
        
    }
    public static void q3main()
    {
        pattern1(5);
        System.out.println("========================");
        pattern2(5);
        
    }
}
