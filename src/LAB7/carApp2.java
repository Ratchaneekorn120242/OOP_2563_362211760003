package LAB7;

import java.util.ArrayList;
import java.util.Scanner;

public class carApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many car do you have?:");
        int num = sc.nextInt();


        ArrayList<car>mycar = new ArrayList<car>();


        for (int i = 0; i < num; i++) {
            //input data to object
            System.out.println("Please, enter car info "+(i+1)+":");
            car c = inputDataObject();
            mycar.add(c);

        }
        //display data IN ArrayList
        displayObject(mycar);

    }//main

    private static void displayObject(ArrayList<car> mycar) {
        System.out.println("All objects in ArrayList: ");
        for (car c:mycar) {
            System.out.println(c.toString());

        }
    }

    private static car inputDataObject() {
        Scanner sc =new Scanner(System.in);


        car c = new car();
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
