package LAB3;

import java.util.Scanner;

public class ex_if_else_if {


    public static void main(String[] args) {
        //ให้ผู้ใช่ใส่ค่าะแนนเป็นจำนวนเต็ม แล้วแสดงผลลัพธ์เป็นเกรด
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your score: ");
        int score = sc.nextInt(); // input as integer
        // int score2 = Integer.parseInt(sc.nextLine());
        //int score2
        // 0-49 == f
        //50-59 == D
        //60=69 == c
        //70-79 == b
        //80-100 == a
        if (score >= 0 && score <= 49) {
            System.out.println("f");
        } else if (score >= 50 && score <= 59) {
            System.out.println("D");
        } else if (score >= 60 && score <= 69) {
            System.out.println("c");
        } else if (score >= 70 && score <= 79) {
            System.out.println("b");
        } else if (score >= 80 && score <= 100) {
            System.out.println("a");
        } else {
            System.out.println("your input score is invalid. ");
        }

    }//main
}//class
