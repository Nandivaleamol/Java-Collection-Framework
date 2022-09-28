package encapsulation.bank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class UserAccount{
    private double balance;
    private long accountNo;
    private String password;
    private String email;
    String name;


    public double getBalance(long accountNo, String password) {
        this.accountNo = accountNo;
        this.password = password;

        if (accountNo == 1234567890 && password.equals("Amol123")){
            System.out.println("Your current balance : "+balance);
            return balance;
        }else{
            System.out.println("Email or Password wrong entered...");
            return 0;
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public long getAccountNo(String email, String password) {
        this.email = email;
        this.password = password;

        if (email.equals("amol@gmail.com") && password.equals("Amol123")){
            return accountNo;
        }else{
            System.out.println("Email or Password wrong entered...");
            return 0;
        }

    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


public class Bank {
    public static void main(String[] args) throws InterruptedException {

        UserAccount  user = new UserAccount();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter password : ");
        String password = sc.nextLine();
        Thread.sleep(1000);

        System.out.println("Enter account no : ");
        long accountNo = sc.nextLong();

        user.setBalance(10000);
        System.out.println(user.getBalance(accountNo, password));



    }

}
