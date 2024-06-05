package sheet2;
public class Question4
{
    public static void q4main()
    {
        Invoice.Cashier cashier1 = new Invoice.Cashier("Mahmoud");
        Invoice.Cashier cashier2 = new Invoice.Cashier("Zenhom");
        
        Invoice I1 = new Invoice(1,"Itme 1",5,10.0);
        cashier1.addInvoice();
        
        Invoice I2 = new Invoice(2, "Item 2", 3, 15.0);
        cashier1.addInvoice();

        Invoice I3 = new Invoice(3, "Item 3", 2, 20.0);
        cashier2.addInvoice();
        
        I1.display();
        System.out.println("Invoices issued by Cashier Mahmoud: " + cashier1.Get_Invoices());
        System.out.println("Invoices issued by Cashier Zenhom: " + cashier2.Get_Invoices());
        System.out.println("Invoices_count => " + I3.getInvoices_count());
    }
}
class Invoice
{
    private int ID;
    private String Description;
    private int Quantity;
    private double Price;
    private static int Invoices_count = 0;

    public int CheckQuantity(int x)
    {
        if(x > 0)
            return x;
        return 0;
    }

    public double CheckPrice(double x)
    {
        if(x > 0)
            return x;
        return 0;
    }

    public Invoice(int ID, String Description, int Quantity, double Price)
    {
        this.ID = ID;
        this.Description = Description;
        this.Quantity = CheckQuantity(Quantity);
        this.Price = CheckPrice(Price);
        Invoices_count++;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public void setDescription(String Description)
    {
        this.Description = Description;
    }

    public void setQuantity(int Quantity) 
    {
        this.Quantity = CheckQuantity(Quantity);
    }      

    public void setPrice(double Price) 
    {
        this.Price = CheckPrice(Price);
    }

    public int getID() 
    {
        return ID;
    }

    public String getDescription() 
    {
        return Description;
    }

    public int getQuantity() 
    {
        return Quantity;
    }

    public double getPrice()
    {
        return Price;
    }

    public static int getInvoices_count() 
    {
        return Invoices_count;
    }

    public double subtotal()
    {
        return Price * Quantity;
    }

    public double total()
    {
        return subtotal() * 1.05; // Apply 5% tax
    }

    public void display()
    {
        System.out.println("Invoice ID: " + ID);
        System.out.println("Description: " + Description);
        System.out.println("Quantity: " + Quantity);
        System.out.println("Price per Item: $" + Price);
        System.out.println("Subtotal: $" + subtotal());
        System.out.println("Total (including 5% tax): $" + total());
    }

    public static class Cashier
    {
        private String name;
        private int cashierInvoicesCount = 0;

        public Cashier(String name)
        {
            this.name = name;
        }

        public void addInvoice() 
        {
            cashierInvoicesCount++;
        }

        public int Get_Invoices()
        {
            return cashierInvoicesCount;
        }                    
    }       

}