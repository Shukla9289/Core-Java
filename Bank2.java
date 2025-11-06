//Bank Server using Abstraction

import java.util.Scanner;
abstract class Bank2{
    public String Name="Satyam's Bank";
    public String IFSC="MyBank123";

public void bankDetail(){
System.out.println("Bank_Name:"+Name+" "+"Bank_IFSC Code"+IFSC);
}
abstract void Deposit();
abstract void Withdraw();
abstract void CheckBal();
}
class bankService extends Bank2{
    private double bal=5000;
    private int pwd;
    public double money;

    public void Deposit(){
        System.out.println("Enter Password:");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();

    if(pwd==123){
        System.out.print("Enter the Deposit amount");
        money=s.nextDouble();
        bal=bal+money;
        System.out.println("Deposited Money:"+money);
        System.out.println("Total Balance:"+bal);
    }
    else{
        System.out.println("Incorrect Password");
    }
    }
    public void Withdraw(){
        System.out.println("Enter Password:");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();

    if(pwd==123){
        System.out.print("Enter the Amount to be Withdrawn:");
        money=s.nextDouble();
        bal=bal-money;
        System.out.println("Withdrawn Money:"+money);
        System.out.println("Total Balance:"+bal);
    }
    else{
        System.out.println("Incorrect Password");
    }
    }
    public void CheckBal(){
        System.out.println("Enter Password:");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();

    if(pwd==123){
        System.out.println("Total Balance:"+bal);
    }
    else{
        System.out.println("Incorrect Password");
    }
    }
}

class Customer2{
    public static void main(String[] args) {
    bankService b=new bankService();
    b.bankDetail();

    int ch;
    System.out.println("1.Deposit");
    System.out.println("2.Withdraw");
    System.out.println("3.CheckBalance");

    System.out.println("Enter Your Choice");
    Scanner s2=new Scanner(System.in);
    ch=s2.nextInt();

    switch(ch){
        case 1:b.Deposit();
        break;
        case 2:b.Withdraw();
        break;
        case 3:b.CheckBal();
        break;
        default:System.out.println("Invalid Choice");
    }
    }
}
