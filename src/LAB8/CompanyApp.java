package LAB8;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employee do you have?: ");
        int num = sc.nextInt();

        ArrayList<Employee>myemp = new ArrayList<Employee>();
        for (int i = 0; i <num ; i++) {
            //
            System.out.println("please, enter Employee info"+(i+1)+":");
           Employee c = inputDataObject();
            myemp.add(c);

        }
        //display data IN ArrayList
        displayObject(myemp);


    }//main

    private static void displayObject(ArrayList<Employee> myemp) {
        System.out.println("All objects in ArrayList:");
        for (Employee c :myemp) {
            System.out.println(c.toString());

        }
    }

    private static Employee inputDataObject() {
        Scanner sc = new Scanner(System.in);

        Employee c = new Employee();
        System.out.println("Enter  id card:");
        c.setPid(sc.nextLine());

        System.out.println("Enter  name :");
        c.setName(sc.nextLine());

        System.out.println("Enter  age:");
        c.setAge(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter gender:");
        c.setGender(sc.nextLine());

        System.out.println("Enter tel:");
        c.setTel(sc.nextLine());

        System.out.println("Enter  id :");
        c.setEmpID(sc.nextLine());

        System.out.println("Enter position :");
        c.setPosition(sc.nextLine());

        System.out.println("Enter  salary :");
        c.setSalary(Double.parseDouble(sc.nextLine()));

        return c;


    }


}//class
