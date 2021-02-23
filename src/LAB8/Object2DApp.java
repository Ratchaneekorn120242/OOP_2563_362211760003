package LAB8;

import java.util.ArrayList;

public interface Object2DApp {
    public static void main(String[] args) {
        //circt
      circle c1 = new circle(10.0);
        c1.calArea();
        System.out.println(c1.getArea());

       //Triangle
        Triangle t1 = new Triangle(15.0,10.0);
        t1.calArea();
        System.out.println(t1.getArea());

        //Rectangle
        Rectangle r1 = new Rectangle(15.0,10.0);
        r1.calArea();
        System.out.println(r1.getArea());

        ArrayList<Object2D> myObject = new ArrayList<Object2D>();
        myObject.add(c1);
        myObject.add(r1);
        myObject.add(t1);




    }//main
}//clasxs


