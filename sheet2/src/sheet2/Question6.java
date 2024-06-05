package sheet2;
public class Question6 
{
    public static void q6main()
    {
        Author author1 = new Author("John Doe", "johndoe@example.com");
        Author author2 = new Author("Zenhom Beh", "Zenhom@example.com");
        
        Book book1 = new Book("1234567890", "Book A", author1, "Publisher A", 19.99);
        Book book2 = new Book("1234567890", "Book B", author2, "Publisher B", 15.99);
        
        System.out.println("Book 1 Information:\n" + book1);
        System.out.println("\nBook 2 Information:\n" + book2);
        
        if (book1.equals(book2))
        {
            System.out.println("\nThese two books are the same.");
        } 
        else 
        {
            System.out.println("\nThese two books are not the same.");
        }
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
    private Author author;
    private String publisher;
    private double price;

    public Book(String ISBN, String name, Author author, String publisher, double price) 
    {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAuthor(Author author)
    {
        this.author = author;
    }

    public void setPublisher(String publisher) 
    {
        this.publisher = publisher;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public void setAuthorName(String x) 
    {
        this.author.setName(x);
    }
    
    public void setAuthorEmail(String x) 
    {
        this.author.setEmail(x);
    }
    
    public String getISBN() {
        return ISBN;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }
    
    public String getAuthorName() 
    {
        return author.getName();
    }
    
    public String getAuthorEmail() 
    {
        return author.getEmail();
    }

    @Override
    public String toString() {
        return "Book{"
                + "ISBN=" + ISBN 
                + ", name=" + name 
                + ", author name=" + author.getName() 
                + ", author email=" + author.getEmail() 
                +", publisher=" + publisher 
                + ", price=" + price + '}';
    }
    
    public boolean equals(Book a)
    {
        return this.ISBN == a.ISBN;
    }
}