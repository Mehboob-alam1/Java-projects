package Advanced;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Accont accont=new Accont(1122,20000,4.5);
        accont.withdraw(2500);
        System.out.println(accont.getBalance());
        accont.deposit(3000);
        System.out.println("The blanc e in account is "+accont.getBalance() + " monthltye interst is " + accont.getMonthlyInterest(accont.getMonthlyInterestRate()) /100 + "%" + " and account was created on " +accont.getDateCreated().toString());
    }
}