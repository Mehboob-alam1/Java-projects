package Advanced;

public class Vehicle {
    private String name;
    private String color;
    private int noOfTyres;
    private int space;
    private int price;

    public Vehicle(){

    }

    public Vehicle(String name,String color){
        this.name=name;
        this.color=color;
    }
    public Vehicle(String name, String color, int noOfTyres, int space, int price) {
        this.name = name;
        this.color = color;
        this.noOfTyres = noOfTyres;
        this.space = space;
        this.price = price;
    }

    public void getCar(){
        System.out.println("Your car name is " +name);
        System.out.println("Your car color is " +color);
        System.out.println("Your car has " +noOfTyres + "tyres");
        System.out.println("Your car space is "+space);
        System.out.println("Your car price will be "+price);



    }






}
