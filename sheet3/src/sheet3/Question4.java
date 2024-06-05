package sheet3;
public class Question4 
{
    public static void q4main()
    {
        Employee[] E = new Employee[5];
        E[0] = new Employee("Mahmoud" , "CS" , 7 , 800);
        E[1] = new Employee("Ahmed" , "CS" , 8 , 700);
        E[2] = new Employee("Mido" , "Math" ,10 , 600);
        E[3] = new Employee("Zenhom" , "CS" , 11, 500);
        E[4] = new Employee("Sayed" , "Stat" , 12 , 10);
        
        //Update the salaries of the employees according to the specified rules.
        for (int i = 0; i < E.length; i++)
        {
            E[i].addSalary();
            E[i].addWork();
        }
        
        System.out.println("The All Employee have salary less than 500");
        for (int i = 0; i < E.length; i++)
        {
            if(E[i].getSalary() < 500)
                System.out.println(E[i].toString());
        }
        
        System.out.println("======================================");
        
        System.out.println("The All Employee have Hours more than 8");
        for (int i = 0; i < E.length; i++)
        {
            if(E[i].getHours() > 8)
                System.out.println(E[i].toString());
        }
        
    }
}

class Employee
{
    private String name,department;
    private int hours;
    private double salary;

    public Employee(String name, String department, int hours, double salary) 
    {
        this.name = name;
        this.department = department;
        this.hours = hours;
        this.salary = salary;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public void setHours(int hours)
    {
        this.hours = hours;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public String getDepartment() 
    {
        return department;
    }

    public int getHours()
    {
        return hours;
    }

    public double getSalary()
    {
        return salary;
    }
    
    public void addSalary()
    {
        if(this.salary < 1000)
            this.salary += 500;
    }
    
    public void addWork()
    {
        if(this.hours > 8)
            this.salary += 100;
    }

    @Override
    public String toString() 
    {
        return "Employee{" + "name=" + name + ", department=" + department + ", hours=" + hours + ", salary=" + salary + '}';
    }
}