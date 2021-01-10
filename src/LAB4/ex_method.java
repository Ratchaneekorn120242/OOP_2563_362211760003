package LAB4;

import java.util.Stack;

public class ex_method {


    public  static void B(int num){// on return
        System.out.println("Hello B"+num);
    }//B
    public static void main(String[] args) {
        System.out.println("Hello Main");
        //call A()
        A();
        A();
        //call B ()
        B(5);
        //call C()
        int result = c(5,5);
        System.out.println(result);
        System.out.println (c(10,10));
    }//main

    public static void A(){ // on return type
        //Statement or method body
        System.out.println("Hello A");
    }//A


    public static int c (int x , int y){
        System.out.println("Hello C");
        return x + y;
    }//c

}
