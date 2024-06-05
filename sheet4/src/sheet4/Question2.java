package sheet4;
import java.util.Arrays;
public class Question2 
{
    public static void longest_Length(String []s)
    {
        int length = 0, index = 0;
        for (int i = 0; i < s.length; i++)
        {
            if(s[i].length() > length)
            {
                length = s[i].length();
                index = i;
            }
        }
        System.out.println("The longest Length: " + length);
        System.out.println("The index of longest Length: " + index);
    }
    
    public static String most_frequent_String(String s[])
    {
        int []frequent = new int[s.length];
        for(int i = 0;i < s.length ; i++)
        {
            for(int j = i;j < s.length ; j++)
            {
                if(s[i] ==  s[j])
                {
                    frequent[i]++;
                }
            }
        }
        int max = 0 , max_index = 0;
        for (int i = 0; i < frequent.length; i++)
        {
            if(frequent[i] > max)
            {
                max = frequent[i];
                max_index = i;
            }
                
        }
        return s[max_index];
    }
    
    public static void reverse_Even(String s[])
    {
        for (int i = 0; i < s.length; i++)
        {
            if(s[i].length() % 2 == 0)
            {
                StringBuffer str = new StringBuffer(s[i]);
                s[i] =  str.reverse().toString();
            }
        }
        System.out.println("The reverse_Even: " + Arrays.toString(s));
    }
    
    public static String String_Max_Char(String s[])
    {
        int All_max_freq = 0;
        String max = "";
        for (int i = 0; i < s.length; i++)
        {
            s[i] = s[i].toLowerCase();
            int number[] = new int[26];
            for (int j = 0; j < number.length; j++)
            {
                number[i] = 0;
            }
            int max_freq = 0;
            for (int j = 0; j < s[i].length(); j++)
            {
                number[s[i].charAt(j) - 'a']++;
                if(number[s[i].charAt(j) - 'a'] > max_freq)
                    max_freq = number[s[i].charAt(j) - 'a'];
            }
            if(max_freq > All_max_freq)
            {
                All_max_freq = max_freq;
                max = s[i];
            }
        }
        return max;
    }
    
    public static int extension(String []s , String exten)
    {
        int count = 0;
        for (int i = 0; i < s.length; i++)
        {
            if(s[i].indexOf(exten) > -1)
            {
                if(s[i].length() - exten.length() == s[i].indexOf(exten))
                {
                    count++;
                }
            }
        }
        return count;
    }
    
    public static String [][] non_Repeated(String []s)
    {
        String [][] result = new String[s.length][2];
        for (int i = 0; i < s.length; i++)
        {
            String str = s[i].toLowerCase();
            int number[] = new int[26];
            for (int j = 0; j < number.length; j++)
            {
                number[j] = 0;
            }
            for (int j = 0; j < str.length(); j++) 
            {
                number[str.charAt(j) - 'a']++;
            }
            int count = 0;
            for (int j = 0; j < number.length; j++)
            {
                if(number[j] == 1)
                    count++;
            }
            result[i][0] = str;
            result[i][1] = String.valueOf(count);
        }
        return result;    
    }
    
    public static void q2main()
    {
        String []s1 = {"oop","java" , "php" , "javaScript" , "c#", "c++"};
        longest_Length(s1);
        
        System.out.println("---------------------------------------------------------");
        
        String []s2 = {"oop","java" , "C#" , "c++" , "C#", "c++" , "C#" , " oop" , "C#"};
        System.out.println("The most frequent string: " + most_frequent_String(s2));
        
        System.out.println("---------------------------------------------------------");
        
        String []s3 = {"oop","java" , "C#" , "c++" , "C#", "c++" , "C#" , "oop" , "C#"};
        reverse_Even(s3);
        
        System.out.println("---------------------------------------------------------");
        
        String []s4 = {"hi", "hello", "there", "vbvb", "ookkaaay", "bbbbnn" , "zzzzzzzz"};
        System.out.println("The string with the maximum occurrence of a character: " + String_Max_Char(s4));
        
        System.out.println("---------------------------------------------------------");
        
        String []s5 = {"hi.c++", "hello.css", "there.java", "vbvb.html", "ookkaaay.java"};
        System.out.println("The count of file extension: " + extension(s5, ".java"));
        
        System.out.println("---------------------------------------------------------");
        System.out.println("Count the number of non-repeated:");
        String []s6 = {"java", "oop", "volvo", "c", "php"};
        String [][]result = non_Repeated(s6);
        for (int i = 0; i < result.length; i++)
        {
            for (int j = 0; j < result[i].length; j++)
            {
                System.out.print(result[i][j] +" ");
            }
            System.out.println();
        }
    }
}
