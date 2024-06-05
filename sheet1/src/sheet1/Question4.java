package sheet1;
import java.util.Scanner;
public class Question4
{
    public static void q4main()
    {
        Scanner in = new Scanner(System.in);
        double a,b,c,r1,r2;
        System.out.print("Please Enter a:");
        a = in.nextDouble();
        System.out.print("Please Enter b:");
        b = in.nextDouble();
        System.out.print("Please Enter c:");
        c = in.nextDouble();
        //Note that: the general law : (-b ± √(b^2 - 4ac))/(2a)
        //(b*b-4*a*c)=> is a determinant if it > 0 the roots is real numbers , it < 0 the roots is imaginary numbers , it = 0 then root1 equals root 2
        if((b*b-4*a*c) > 0)
        {
            r1 = (-b + Math.sqrt(b*b-4*a*c)) / 2 * a;
            r2 = (-b - Math.sqrt(b*b-4*a*c)) / 2 * a;
            System.out.println("The roots : "+ r1 + " , "+ r2);
        }        
        else if((b*b-4*a*c) < 0)
        {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-(b*b-4*a*c)) / (2 * a);
            System.out.println("The Roots Comples: \nRoot1 = " + realPart + "+" + imaginaryPart + "i");
            System.out.println("Root2 = " + realPart + "-" + imaginaryPart + "i");
        }
        else
        {
            //r1 = r2
            r1 = - b / 2 * a;
            System.out.println("The Roots are real and equals..= " + r1);           
        }
    }
}
