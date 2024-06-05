package sheet6;

import java.util.Arrays;

public class Question3 
{
    public static void q3main()
    {
        Circle c1 = new Circle("red", true, 2);
        Circle c2 = new Circle("yellow", false, 3);
        Rectangle r1 = new Rectangle("green", true, 2, 3);
        Rectangle r2 = new Rectangle("black", true, 4, 5);
        Square s1 = new Square("red", true, 5);
        Square s2 = new Square("red", true, 10);
        Geometric_Object arr[] = {c1, c2, r1, r2, s1, s2};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
            System.out.println(arr[i].getArea());
        }
    }
}

class ComparableSorting
{
    public static Comparable swap(Comparable x,Comparable  dumy)
    {
        return x;
    }
    public static <T extends Comparable <T>> void sort(T A[])
    {
        for (int i = 0; i < A.length; i++)
        {
            for (int j = i + 1; j < A.length; j++) 
            {
                if(A[i].compareTo(A[j]) > 0)
                    A[i] = (T) swap(A[j], A[j] = A[i]);
            }
        }
    }
}

