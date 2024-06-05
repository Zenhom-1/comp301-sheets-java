package sheet6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Question4
{
    public static void q4main()
    {
        SavingsAccount s1 = new SavingsAccount(1000, 10);
        SavingsAccount s2 = new SavingsAccount(2000, 10);
        SavingsAccount s3 = new SavingsAccount(3000, 10);
        CheckingAccount c1 = new CheckingAccount(5000);
        CheckingAccount c2 = new CheckingAccount(7000);
        BankAccount B[] = {s1, s2, s3, c1, c2};
     
        s1.deposit(500);
        System.out.println("s1.getbalance ==>" + s1.getBalance());
        s1.withdraw(200);
        System.out.println("s1.getbalance ==>" + s1.getBalance());
        s1.transfer(s2, 300);
        System.out.println("s1.getbalance ==>" + s1.getBalance());
        System.out.println("s2.getbalance ==>" + s2.getBalance());
        s3.addInterst();
        System.out.println("s3.getbalance ==>" + s3.getBalance());
        c1.deposit(1000);
        c1.withdraw(500);
        System.out.println("c1.getTransactionCount ==>" + c1.getTransactionCount());
        c1.transfer(c2, 500);
        System.out.println("c1.getTransactionCount ==>" + c1.getTransactionCount());
        System.out.println("c1.getbalance ==>" + c1.getBalance());
        System.out.println("c2.getbalance ==>" + c2.getBalance());
        c1.transfer(s3, 700);
        System.out.println("s3.getbalance ==>" + s3.getBalance());
        System.out.println("c1.getbalance ==>" + c1.getBalance());
        System.out.println("c1.getTransactionCount ==>" + c1.getTransactionCount());
        c1.deductFees();
        System.out.println("c1.getbalance ==>" + c1.getBalance());
        System.out.println("===============================");
        ArrayList <BankAccount> l = new ArrayList <BankAccount>();
        SavingsAccount s4 = new SavingsAccount(1000, 10);
        SavingsAccount s5 = new SavingsAccount(2000, 10);
        l.add(s4);
        l.add(s5);
        BalanceCompare bc = new BalanceCompare();
        Collections.sort(l,bc);
        for (BankAccount Value : l)
        {
            System.out.println(Value.getBalance());
        }
    }
}

class BankAccount
{
    private double balance;

    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    public void deposit(double amount)
    {
        this.balance += amount;
    }
    
    public void withdraw(double amount)
    {
        if(amount > this.balance)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            this.balance -= amount;
        }
    }
    
    public void transfer(BankAccount other,double amount)
    {
        this.withdraw(amount);
        other.deposit(amount);
    }
}

class SavingsAccount extends BankAccount
{
    private double interestRate;

    public SavingsAccount(double balance, double interestRate)
    {
        super(balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }
    
    public void addInterst()
    {
        double insert = this.getBalance() * (this.interestRate/100);
        this.deposit(insert);
    }
}

class CheckingAccount extends BankAccount 
{
    private int transactionCount;
    private static final int noOfFreeTransaction = 3;
    private static final double transactionFees = 2.0;

    public CheckingAccount(double balance)
    {
        super(balance);
        this.transactionCount = 0;
    }

    public int getTransactionCount()
    {
        return transactionCount;
    }

    @Override
    public void deposit(double amount)
    {
        this.transactionCount++;
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount)
    {
        this.transactionCount++;
        super.withdraw(amount);
    }

    @Override
    public void transfer(BankAccount other,double amount)
    {
        this.transactionCount++;
        super.transfer(other ,amount);
    }

    public void deductFees()
    {
        if(this.transactionCount > this.noOfFreeTransaction)
        {
            double fees = this.transactionFees * (this.transactionCount - this.noOfFreeTransaction);
            super.withdraw(fees);
        }
        this.transactionCount = 0;
    }

    @Override
    public String toString()
    {
        return "CheckingAccount{" + "Balance=" + getBalance() + "transactionCount=" + transactionCount + '}';
    }
}

class BalanceCompare implements Comparator<BankAccount>
{
    @Override
    public int compare(BankAccount b1, BankAccount b2)
    {
        double p1 = b1.getBalance();
        double p2 = b2.getBalance();
        
        if(p1 == p2)
            return 0;
        else if(p1 > p2)
            return -1;
        else
            return 1;
    }
}

/*
    BankAccount B[] = new BankAccount[5];
    B[0] = new SavingsAccount(1000, 10);
    B[1] = new SavingsAccount(2000, 10);
    B[2] = new SavingsAccount(3000, 10);
    B[3] = new CheckingAccount(5000);
    B[4] = new CheckingAccount(7000);

    B[0].deposit(500);
    System.out.println("B[0].getbalance ==>" + B[0].getBalance());
    B[0].withdraw(200);
    System.out.println("B[0].getbalance ==>" + B[0].getBalance());
    B[0].transfer(B[1], 300);
    System.out.println("B[0].getbalance ==>" + B[0].getBalance());
    System.out.println("B[1].getbalance ==>" + B[1].getBalance());
    B[2].addInterst();
*/