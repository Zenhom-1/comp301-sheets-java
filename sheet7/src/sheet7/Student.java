package sheet7;

import java.util.ArrayList;

public class Student 
{
    String name;
    int age;
    ArrayList<String> subjects;

    public Student(String name, int age, ArrayList<String> subjects)
    {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setSubjects(ArrayList<String> subjects)
    {
        this.subjects = subjects;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    public ArrayList<String> getSubjects()
    {
        return subjects;
    }

    @Override
    public String toString()
    {
        return name + "\t" + age + "\t" + subjects.toString() + '\n';
    }
    
    
}
