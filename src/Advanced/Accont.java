package Advanced;

import java.util.Date;

public class Accont {
    private int id=0;
    private double balance=0;
    private double annaualInterestRate=0;
    private Date dateCreated = new Date();
    private double monthlyInterestRate=0;



   public Accont(){

   }

    public Accont(int id, double balance,double annaualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annaualInterestRate=annaualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnaualInterestRate() {
        return annaualInterestRate;
    }

    public void setAnnaualInterestRate(double annaualInterestRate) {
        this.annaualInterestRate = annaualInterestRate;
    }
    public Date getDateCreated(){
       return dateCreated;
    }

    public double  getMonthlyInterestRate(){

       return  annaualInterestRate/12;

    }

    public double getMonthlyInterest(double mir){

       return balance*mir;
    }

    public void withdraw(double howMuch){

    this.balance=   balance-howMuch;
    }

    public void deposit(double howMuch){
       this.balance=balance+howMuch;

    }
}
