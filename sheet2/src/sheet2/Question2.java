package sheet2;
public class Question2
{
    public static int reverse(int x)
    {
        int rev = 0;
        while(x>0)
        {
            rev*=10;
            rev +=x%10; 
            x/=10;
        }
        return rev;
    }
    public static void q2main()
    {
        int x = 1234;
        System.out.println("The Reverse Number: " + reverse(x));
    }
}
