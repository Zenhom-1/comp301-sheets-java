package sheet3;
import java.util.Arrays;
public class Question1
{
    public static int[] insertAt(int []arr , int x , int pos)
    {
        if (pos < 0 || pos > arr.length)
            return arr;
        int []result = new int [arr.length + 1];
        for (int i = 0; i <= arr.length; i++)
        {
            if(i< pos)
                result[i] = arr[i];
            else if(i == pos)
                result[i] = x;
            else
                result[i] = arr[i-1];
        }
        return result;
    }
    
    public static boolean Is_Prime(int x)
    {
        if(x <= 1)
            return false;
        
        if(x == 2)
            return true;
        
        for (int i = 2; i < x; i++) 
        {
            if(x % i == 0)
                return false;
        }
        return true;
    }
    
    public static int[] Find_Prime(int []arr)
    {
        int []result = new int[0];
        for (int i = 0; i < arr.length; i++)
        {
            if(Is_Prime(arr[i]))
                result = insertAt(result , arr[i] , result.length);
        }
        return result;
    }
    
    public static int count_Factor(int x)
    {
        int c = 0;
        for (int i = 1; i <= x ; i++)
        {
            if(x%i == 0)
                c++;
        }
        return c;
    }
    
    public static int [][][] getFactors(int arr[])
    {
        int [][][]result =new int [arr.length][][];
        for (int i = 0; i < arr.length; i++)
        {
            result[i] = new int [count_Factor(arr[i])][2];
            int index = 0;
            for (int j = 1; j <= arr[i]; j++) 
            {
                if(arr[i] % j == 0)
                {
                    result[i][index][0] = j;
                    if(j%2==0)
                        result[i][index][1] = 1;
                    else
                        result[i][index][1] = 0;
                    index++;
                }           
            }
        }
        return result;
    }
    
    public static void q1main()
    {
        int []arr1 = {1,2,3,4,6};
        arr1 =insertAt(arr1,5,4);
        System.out.println(Arrays.toString(arr1));
        
        System.out.println("=====================================");
        
        int []arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        arr2 = Find_Prime(arr2);
        System.out.println(Arrays.toString(arr2));
        
        System.out.println("=====================================");
        
        int []arr3 = {3,6,9};
        int[][][]display = getFactors(arr3);
        for (int i = 0; i < display.length; i++)
        {
            for (int j = 0; j < display[i].length; j++)
            {
                for (int k = 0; k < display[i][j].length; k++) 
                {
                    System.out.print(display[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}