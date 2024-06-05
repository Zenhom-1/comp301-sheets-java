package sheet4;
import java.util.ArrayList;
public class Question1 
{
    public static boolean palindrom(String s)
    {
        StringBuffer rev = new StringBuffer(s);
        rev.reverse();
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != rev.charAt(i))
                return false;
        }
        return true;
    }
    
    public static String trimming(String s)
    {
        s=s.replaceAll(" ", "");
        return s;
    }
    
    public static int count_Char(String s, char a)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            if(s.charAt(i) == a)
                count++;
        }
        return count;
    }
    
    public static String remove_Duplicates(String input)
    {
        int flag;
        String result = input.substring(0,1);
        
        for(int i = 1;i<input.length();i++)
        {
            flag = 0;
            for (int j = 0; j < result.length(); j++)
            {
                if(input.charAt(i) == result.charAt(j))
                    flag++;
            }
            if(flag == 0)
                 result = result.concat(String.valueOf(input.charAt(i)));
                //result += input.charAt(i);            //anthor Soln
        }
        return result;
    }
    
    public static void display_words_Twice(String s)
    {
        String []Words = s.split("\\s+"); // Split by Whitespaces.
        ArrayList l = new ArrayList();
        for (int i = 0; i < Words.length; i++)
        {
            int flag = 0;
            for (int j = 0; j < Words.length; j++) 
            {
                if(Words[i].equals(Words[j]))
                    flag++;
            }
            if(flag > 2 && l.contains(Words[i]) == false)
            {
                    l.add(Words[i]);    
            }
        }
        System.out.println("Tha Array has Words that appear more than twice: " + l);
    }
    
    public static int third_Occurrence(String s, char a)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == a)
                count++;
            if(count == 3)
                return i;
        }
        return -1;
    }
    
    public static void min_max_occurrences(String a)
    {
        a = a.toLowerCase();
        int []number = new int [26];
        for (int i = 0; i < 26; i++)
        {
            number[i] = 0;
        }
        for (int i = 0; i < a.length(); i++) 
        {
            for (int j = 0; j < a.length(); j++) 
            {
                if(a.charAt(i) ==  a.charAt(j))
                    number[a.charAt(i) - 'a']++;  
            }
        }
        char min_Char = 'a' , max_Char = 'a';
        int min = 999999999 , max = 0;
        for (int i = 0; i < 26; i++) 
        {
            if(number[i] > max)
            {
                max = number[i];
                max_Char = (char)(i + 'a'); 
            }
            if(number[i] < min && number[i] > 0)
            {
                min = number[i];
                min_Char = (char)(i + 'a'); 
            }
        }
        System.out.println("Minimum number of occurences: "+ min_Char);
        System.out.println("Maximum number of occurences: "+ max_Char);
    }
    
    public static void q1main()
    {
        String s = "abba";
        System.out.println("The String is palindrom: " + palindrom(s));
        
        System.out.println("---------------------------------------------------------");
        
        String s1 = "                     ab       ba                      ";
        System.out.println("The String: " + s1);
        System.out.println("The String without whitespaces: " + trimming(s1));
        
        System.out.println("---------------------------------------------------------");
        
        String s2 = "aabbbbccdd";
        System.out.println("Count the occurrences of a character: " + count_Char(s2,'b'));
        
        System.out.println("---------------------------------------------------------");
        
        String s3 = "aabbbbccddaaabbbcccddd";
        String withoutDuplicates = remove_Duplicates(s3);
        System.out.println("the String without duplicate: " + withoutDuplicates);
        
        System.out.println("---------------------------------------------------------");
        
        String s4 = "Java Java oop oop oop Java oop c++ c++ C#";
        display_words_Twice(s4);
        
        System.out.println("---------------------------------------------------------");
        
        String s5 = "abcabcabcdfg";
        System.out.println("the index of third occurrences of a character: " + third_Occurrence(s5, 'b'));
        
        System.out.println("---------------------------------------------------------");
        
        String s6 = "aaabbbcccddddffeee";
        min_max_occurrences(s6);

    }
}














