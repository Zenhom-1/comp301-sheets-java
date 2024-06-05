package sheet1;
import java.util.Scanner;
public class Question2 
{
    public static void q2main()
    {
        int n1,n2;
        //The First Method.
        //the command line arguments
        //Right click on the project -> properties -> run => at arguments field write the numbers that is the array args in the parameter int main method
        //n1=Integer.parseInt(args[0]);
        //n2=Integer.parseInt(args[1]);
        
        //The Second Method
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.print("Please Enter Number 1: ");
            n1 = in.nextInt();
            System.out.print("Please Enter Number 2: ");
            n2 = in.nextInt();
            if(n2==0)
                System.out.println("Please Enter Number 2 shouldn't be 0");
        }while(n2==0);
        System.out.println("The quotient = " + ((float)n1/n2));
        System.out.println("The remainder = " + (n1%n2));
    }
}
