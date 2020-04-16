class Bank
{
    public double deposit(double amount, double balance)
    {
        return amount+balance;
    }
    public double withdraw(double amount, double balance)
    {
        if(balance >= amount)
            return balance-amount;
        return 0.0;
    }
}

public class Main
{
    public static void main(String [] args)
    {
        Bank b = new Bank();
        System.out.println(b.deposit(99.99,00.01));
        System.out.println(b.withdraw(99.99,00.01));
        System.out.println(b.withdraw(00.01,99.99));
    }
}