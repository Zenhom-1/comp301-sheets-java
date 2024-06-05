
package sheet4;
import java.util.ArrayList;
public class Question3 
{
    public static void q3main()
    {
        Car_Test cars=new Car_Test(6);
        car car1=new car("X5", "BMW", 1000, 2002);
        car car2=new car("X5","BMW" , 9000, 2002);
        car car3=new car("THRT","TOYOTA" , 9900, 2002);
        car car4=new car("XGVB","TOYOTA" , 99900, 2020);
        car car5=new car("X5", "TOYOTA", 999000, 2012);
        car car6=new car("X5", "BMW", 18500, 2002);
        cars.insert(car1);
        cars.insert(car2);
        cars.insert(car3);
        cars.insert(car4);
        cars.insert(car5);
        cars.insert(car6);
        System.out.println(cars.l+"\n ==============");
        cars.delete_By_Model_And_Year("TOYOTA", 2012);
        System.out.println("\n ==============");
        System.out.println(cars.equals(car1, car6)+"\n ==============");
        cars.replace_By_Name_And_Model("BMW", "X5", "X6");
        System.out.println(cars.l+"\n ==============");
    }
}

class car
{
    private String carModel, carName;
    private float carPrice;
    private int yearOfProduction;

    public car(String carModel, String carName, float carPrice, int yearOfProduction)
    {
        this.carModel = carModel;
        this.carName = carName;
        this.carPrice = carPrice;
        this.yearOfProduction = yearOfProduction;
    }

    public void setCarModel(String carModel) 
    {
        this.carModel = carModel;
    }

    public void setCarName(String carName)
    {
        this.carName = carName;
    }

    public void setCarPrice(float carPrice) 
    {
        this.carPrice = carPrice;
    }

    public void setYearOfProduction(int yearOfProduction) 
    {
        this.yearOfProduction = yearOfProduction;
    }

    public String getCarModel() 
    {
        return carModel;
    }

    public String getCarName()
    {
        return carName;
    }

    public float getCarPrice() 
    {
        return carPrice;
    }

    public int getYearOfProduction()
    {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "car{" + "carModel=" + carModel + ", carName=" + carName + ", carPrice=" + carPrice + ", yearOfProduction=" + yearOfProduction + '}';
    }   
}

class Car_Test
{
    ArrayList<car> l;
    
    public Car_Test(int size)
    {
        this.l = new ArrayList<>(size);
    }
    
    public boolean equals(car A , car B)
    {
        return A.getCarName() == B.getCarName() && A.getCarModel() == B.getCarModel();
    }
    
    public void insert(car A)
    {
        l.add(A);
    }
    
    public void replace_By_Name_And_Model(String name , String model , String replace)
    {
        for (int i = 0; i < l.size(); i++)
        {
            if(l.get(i).getCarName().equals(name) && l.get(i).getCarModel().equals(model))
            {
                l.get(i).setCarModel(replace);
            }
        }
    }
    
    public void delete_By_Model_And_Year(String name ,  int year)
    {
        for (int i = 0; i < l.size(); i++)
        {
            if(l.get(i).getCarName() == name && l.get(i).getYearOfProduction() <= year)
            {
                l.remove(i);
            }
        }
        System.out.println("The Car After Delete: ");
        System.out.println(l);
    }
}