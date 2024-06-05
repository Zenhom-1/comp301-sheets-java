package sheet5;
public class Question3 
{
    public static void q3main()
    {
        Vehicle arr[] = new Vehicle[5];
        arr[0] = new Car("Toyota" , "Black", 100000, 10, 4);
        arr[1] = new Car("BMW" , "Black", 1000000, 8, 4);
        arr[2] = new Car("Kia" , "REd", 500000, 11, 4);
        arr[3] = new Truck("Mercedes" , "Black", 999999, 10, 3200);
        arr[4] = new Truck("Toyota" , "Black", 100000, 10, 3800);
        
        for (int i = 0; i < arr.length; i++)
        {
            arr[i].display();
            System.out.println("\n==============================\n");
        }
    }
}

class Vehicle
{
    String name , color;
    double price;
    int number_Of_Cylinders;
    static int number_Of_Vehicles = 0;

    public Vehicle(String name, String color, double price, int number_Of_Cylinders)
    {
        this.name = name;
        this.color = color;
        this.price = price;
        this.number_Of_Cylinders = number_Of_Cylinders;
        this.number_Of_Vehicles++;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setNumber_Of_Cylinders(int number_Of_Cylinders)
    {
        this.number_Of_Cylinders = number_Of_Cylinders;
    }

    public String getName() 
    {
        return name;
    }

    public String getColor()
    {
        return color;
    }

    public double getPrice() 
    {
        return price;
    }

    public int getNumber_Of_Cylinders() 
    {
        return number_Of_Cylinders;
    }

    public static int getNumber_Of_Vehicles()
    {
        return number_Of_Vehicles;
    }
    
    public void display()
    {
        System.out.println("name : "+this.name);
        System.out.println("color : "+this.color);
        System.out.println("price : "+this.price);
        System.out.println("cylinders : "+this.number_Of_Cylinders);
        System.out.println("number of Vehicles : " + this.number_Of_Vehicles);
    }
}
    
class Car extends Vehicle
{
    int Passengers;
    static int number_Of_Vehicles = 0;

    public Car(String name, String color, double price, int number_Of_Cylinders, int Passengers)
    {
        super(name, color, price, number_Of_Cylinders);
        this.Passengers = Passengers;
        number_Of_Vehicles++;
    }

    public void setPassengers(int Passengers)
    {
        this.Passengers = Passengers;
    }

    public int getPassengers() 
    {
        return Passengers;
    }

    public static int getNumber_Of_Vehicles() 
    {
        return number_Of_Vehicles;
    }
    
    @Override
    public void display()
    {
        System.out.println("name : "+this.getName());
        System.out.println("color : "+this.getColor());
        System.out.println("price : "+this.getPrice());
        System.out.println("cylinders : "+this.getNumber_Of_Cylinders());
        System.out.println("Passengers : "+this.getPassengers());
        System.out.println("number of Vehicles : " + this.number_Of_Vehicles);
    }
    
    @Override
    public double getPrice() 
    {
        if(this.getNumber_Of_Cylinders() <= 4)
            return this.price * 1.15;
        else
            return this.price * 1.3;
    }
}

class Truck extends Vehicle
{
    int load_capacity;
    static int number_Of_Vehicles = 0;

    public Truck(String name, String color, double price, int number_Of_Cylinders, int load_capacity)
    {
        super(name, color, price, number_Of_Cylinders);
        this.load_capacity = load_capacity;
        number_Of_Vehicles++;
    }
    
    public void setLoad_capacity(int load_capacity) 
    {
        this.load_capacity = load_capacity;
    }

    public int getLoad_capacity() 
    {
        return load_capacity;
    }

    @Override
    public void display()
    {
        System.out.println("name : "+this.getName());
        System.out.println("color : "+this.getColor());
        System.out.println("price : "+this.getPrice());
        System.out.println("cylinders : "+this.getNumber_Of_Cylinders());
        System.out.println("load_capacity : "+this.getLoad_capacity());
        System.out.println("number of Vehicles : " + this.number_Of_Vehicles);
    }
    
    @Override
    public double getPrice() 
    {
        if(this.getNumber_Of_Cylinders() <= 6 && this.getLoad_capacity() < 3500)
            return this.price * 1.1;
        else
            return this.price * 1.2;
    }
}