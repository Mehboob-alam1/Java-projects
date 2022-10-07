package Advanced;

public class Circle {
  private int radius;
  private String color;
   private  int area;


    public  Circle(int radius,String color){

      this.radius=radius;
      this.color=color;


    }

    public void getArea(){

        System.out.println(3.1416*radius*radius);
    }
}
