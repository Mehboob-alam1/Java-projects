package Advanced;

public class Rectangle {
   private double height=1;
  private   double width=1;
   private double area;
  private   double perimeter;


    public Rectangle(){

    }

    public Rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }



    public double getArea(){

        return width*height;
    }
    public double getPerimeter(){

        return 2* (height + width);
    }

    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){

        return height;
    }

    public void setWidth(double width){
        this.width=width;
    }
    public double getWidth(){

        return width;
    }
    public void setArea(double area){
        this.area=area;
    }

    public void setPerimeter(double perimeter){
        this.perimeter=perimeter;
    }
}
