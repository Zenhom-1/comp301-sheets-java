package sheet2;
public class Question1
{
    public static int count(int x)
    {
        int c = 0;
        while(x>0)
        {
            x/=10;
            c++;
        }
        return c;
    }
    public static void q1main()
    {
        int x = 1234;
        System.out.println("The Counter Number: " + count(x));
    }
}
