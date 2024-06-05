package sheet3;
import java.util.Scanner;
public class Question2 
{
    public static void q2main()
    {
        Book b1= new Book("1", "Book 1" , "Dar ELslam" , 10.0, 1);
        b1.setAuthor();
        
        System.out.println("---------------------------------");
        
        Book b2=new Book("2","Book 2","mktbt 2bla fdyla",20.0,2);
        b2.setAuthor();
        
        System.out.println("---------------------------------");
        
        Book b3=new Book("1","Book 3" ,"mktbt El Fareed",30,1);
        b3.setAuthor();
     
        System.out.println("---------------------------------");
        
        System.out.println(b1);
        System.out.println("=============================");
        System.out.println(b2);
        System.out.println("=============================");
        System.out.println(b3);
        
        System.out.println("***************************************");
        if(b1.equals(b3))
            System.out.println("The Two Book Is The Same of ISBN");
        else
            System.out.println("The Two Book Is not The Same of ISBN");
    }
}
class Author
{
    private String name , email;

    public Author(String name, String email) 
    {
        this.name = name;
        this.email = email;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail() 
    {
        return email;
    }
    
    public void display()
    {
        System.out.println("Author name: " + name + "(Email: " + email + ")");
    }
  
}

class Book
{
    private String ISBN;
    private String name;
    private Author[] author;
    private String publisher;
    private double price;

    public Book(String ISBN, String name, String publisher, double price, int size_author) 
    {
        this.ISBN = ISBN;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
        this.author = new Author[size_author];
    }

    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAuthor()
    {
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < this.author.length; i++)
        {
            String name, email;
            System.out.print("Enter Author" + (i + 1) + " name: ");
            name = in.nextLine();
            System.out.print("Enter Author" + (i + 1) + " email: ");
            email = in.nextLine();
            author[i] = new Author(name , email);
        }
        
    }

    public void setPublisher(String publisher) 
    {
        this.publisher = publisher;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }
    
    public String getISBN()
    {
        return ISBN;
    }

    public String getName()
    {
        return name;
    }

    public String getPublisher() 
    {
        return publisher;
    }

    public double getPrice() 
    {
        return price;
    }

    public Author[] getAuthor()
    {
        return author;
    }
    
    @Override
    public String toString()
    {
        String Info="";
        Info = "Book{";
        Info += "ISBN=" + this.ISBN;
        Info += ", name=" + this.name;
        for (int i = 0; i < this.author.length; i++)
        {
            Info += ", author" + (i+1) + " name=" + this.author[i].getName();
            Info += ", author" + (i+1) + " email=" + this.author[i].getEmail();
        }
        Info += ", publisher=" + this.publisher ;
        Info += ", price=" + price + '}';
        
        return Info;

    }
    
    public boolean equals(Book a)
    {
        return this.ISBN == a.ISBN;
    }
}