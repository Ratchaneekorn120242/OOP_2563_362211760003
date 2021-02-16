package LAB7;

import java.util.ArrayList;
import java.util.Scanner;

public class carApp {

    public static void main(String[] args) {
       //create objects
       car c1 = new car();


       car c2 = new car("AB123","Black","Honda");


       System.out.println(c1.toString());
       System.out.println(c2.toString());

       c1 = inputDataObject (c1);
        System.out.println(c1.toString());

        //store object in ArrayList
        ArrayList<car> mycar = new ArrayList<car>();
        mycar.add(c1);
        mycar.add(c2);


        System.out.println(mycar.get(0));



    }

    private static car inputDataObject(car c) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter car id:");
        String id = sc.nextLine();
        c.setId(id);

        System.out.println("Enter car Color:");
        c.setColor(sc.nextLine());

        System.out.println("Enter car brand:");
        c.setBrand(sc.nextLine());

        return c;



    }


}//class
