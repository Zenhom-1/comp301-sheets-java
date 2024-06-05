package sheet3;
import java.util.Arrays;
import java.util.Scanner;
public class Question5 
{
    public static void q5main()
    {
        Student_Tset Main = new Student_Tset(3);
        Main.insert();
        System.out.println("*****************************************");
        Main.display();
        System.out.println("*****************************************");
        System.out.println("Student has Highest Total Degree");
        Main.Highest_Total_Degree().display();
        System.out.println("*****************************************");
        System.out.println("Students of probation");
        Main.probation();
    }
}

class Date
{
    private int day , month , year;

    public Date() 
    {
        
    }

    public Date(int day, int month, int year) 
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) 
    {
        this.day = day;
    }

    public void setMonth(int month) 
    {
        this.month = month;
    }

    public void setYear(int year) 
    {
        this.year = year;
    }
    
    
    
    public boolean equals(Date a)
    {
        return this.day == a.day && this.month == a.month && this.year == a.year;
    }

    @Override
    public String toString()
    {
        return "(" + "Date: " + day + "/" + month + "/" + year + ')';
    }
}

class student 
{
    private int rolling_number;
    private String name;
    private Date birthDate;
    private int maxDegree;
    private int[] degrees = new int[3];
    private double[] cgpa = new double[5];
    private static int count = 0;

    public student() 
    {
        this.birthDate = new Date();
    }
    
    public student(String name, Date birthDate, int maxDegree)
    {
        this.name = name;
        this.birthDate = birthDate;
        this.maxDegree = maxDegree;
        this.rolling_number = ++count;
    }

    public void setRolling_number(int rolling_number) 
    {
        this.rolling_number = rolling_number;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setBirthDate(int d, int m, int y) 
    {
        this.birthDate.setDay(d);
        this.birthDate.setMonth(m);
        this.birthDate.setYear(y);
    }

    public void setMaxDegree(int maxDegree) 
    {
        this.maxDegree = maxDegree;
    }
    
    public void set_Degress(int [] degree)
    {
        for (int i = 0; i < 3; i++) 
        {
            if(degree[i] >= 0 && degree[i] <= maxDegree)
                this.degrees[i] = degree[i];
            else
                 System.out.println("Invalid degree value for subject " + (i + 1));
        }
    }
    
    public void set_cgpa(int Semester, double cgpa)
    {
        if(Semester >= 1 && Semester <= 5)
            this.cgpa[Semester - 1] = cgpa;
        else
            System.out.println("Invalid semester value");
    }

    public int getRolling_number() 
    {
        return rolling_number;
    }

    public String getName() 
    {
        return name;
    }

    public Date getBirthDate() 
    {
        return birthDate;
    }

    public int getMaxDegree()
    {
        return maxDegree;
    }

    public int[] getDegrees()
    {
        return degrees;
    }

    public double[] getCgpa() 
    {
        return cgpa;
    }
    
    public int total_degrees()
    {   
        return degrees[0] + degrees[1] + degrees[2];
    }
    public String grade()
    {
        double totaldegree = degrees[0] + degrees[1] + degrees[2];
        double average = totaldegree / (this.maxDegree * 3) *100;
        if(average >= 90)
            return "A";
        else if(average >= 85)
            return "A-";
        else if(average >= 80)
            return "B+";
        else if(average >= 75)
            return "B";
        else if(average >= 70)
            return "C+";
        else if(average >= 65)
            return "C";
        else if(average >= 60)
            return "D";
        else 
            return "F";
    }
    
    public void display()
    {
        System.out.println("Name: " + this.name);
        this.birthDate.toString();
        System.out.println("MaxDegree: " + this.maxDegree);
        System.out.println("Degrees: " + Arrays.toString(degrees));
        System.out.println("Cgpa: " + Arrays.toString(cgpa));
        System.out.println("Totaldegree: " + total_degrees());
        System.out.println("Calculated Grade: " + grade()); 
        System.out.println("Rolling number: " + this.rolling_number);
    }
    
    public boolean Bad_cgpa()
    {
        for (int i = 1; i < 5; i++)
        {
            if(this.cgpa[i - 1] < 2 && this.cgpa[i] < 2)
                return true;
        }
        return false;
    }
}

class Student_Tset
{
    student []s;

    public Student_Tset(int size)
    {
        s = new student[size];
    }
    
    public void insert()
    {
        for (int i = 0; i < s.length; i++) 
        {
           s[i] = new student();
        }
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < s.length; i++) 
        {
            System.out.println("Enter Student " + (i + 1));
            s[i].setRolling_number(s.length);
            System.out.print("name: ");
            s[i].setName(in.next());
            System.out.print("Enter Day of Birth: ");
            int d = in.nextInt();
            System.out.print("Enter month of Birth: ");
            int m = in.nextInt();
            System.out.print("Enter Year of Birth: ");
            int y = in.nextInt();
            s[i].setBirthDate(d,m,y);
            System.out.print("Enter Max degree Of Cource: ");
            s[i].setMaxDegree(in.nextInt());
            int []degrees = new int[3];
            System.out.print("Enter The degree Of Cource 1 between 0 and Max Degree: ");
            degrees[0] = in.nextInt();
            System.out.print("Enter The degree Of Cource 2 between 0 and Max Degree: ");
            degrees[1] = in.nextInt();
            System.out.print("Enter The degree Of Cource 3 between 0 and Max Degree: ");
            degrees[2] = in.nextInt();
            s[i].set_Degress(degrees);
            System.out.print("Enter The Cgpa Of Semester 1: ");
            double sem1 = in.nextDouble();
            s[i].set_cgpa(1, sem1);
            System.out.print("Enter The Cgpa Of Semester 2: ");
            double sem2 = in.nextDouble();
            s[i].set_cgpa(2, sem2);
            System.out.print("Enter The Cgpa Of Semester 3: ");
            double sem3 = in.nextDouble();
            s[i].set_cgpa(3, sem3);
            System.out.print("Enter The Cgpa Of Semester 4: ");
            double sem4 = in.nextDouble();
            s[i].set_cgpa(4, sem4);
            System.out.print("Enter The Cgpa Of Semester 5: ");
            double sem5 = in.nextDouble();
            s[i].set_cgpa(5, sem5);
        }       
    }
    
    public student Highest_Total_Degree()
    {
        student result = s[0];
        for(int i = 1; i < s.length; i++ )
        {
            if(s[i].total_degrees() > result.total_degrees())
                result = s[i];
        }
        return result;
    }
    
    public void probation()
    {
        for (int i = 0; i < s.length; i++)
        {
            if(s[i].Bad_cgpa())
                s[i].display();
        }
    }   

    public void display() 
    {
        for (int i = 0; i < s.length; i++)
        {
            System.out.println("The Information of Student" + (i + 1) + "is: ");
            s[i].display();
            System.out.println("==================================");
        }
    }
}