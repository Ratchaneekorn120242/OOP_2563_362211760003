package LAB5;

import java.util.Scanner;

//เขียนโปรแกรมรับค่าข้อมูลจากผู้ใช้ 5 จำนวน
//ผลรวม ค่าเฉลี่ย ค่ามากสุด ค่าน้อยสุด
public class ex_array2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num[] = new  int[5];
      //
        num = inputdata(num);

        //
        pisplaArray(num);
        //total va
        int total = totalValue(num);
        System.out.println("Total value in array:"+total);
        //average value in array
        System.out.println("Average value in array:"+(total/num.length));

        //find maxium value in array
        findMax(num);
        //
        findMin(num);

    }

    private static void findMin(int[] num) {
        int min = num [0];
        for (int v:num) {
            if (min<v)
                min = v;

        }
        System.out.println("The minimum value:"+min);
    }

    private static void findMax(int[] num) {
        int max = num [0];
        for (int v:num) {
            if (max<v)
                max = v;

        }
        System.out.println("The maximum value:"+max);
    }

    private static int totalValue(int[] num) {
        int total =0;
        for (int v:num) {

        }
            return  total;
        }


    private static void pisplaArray(int[] num) {
        for (int v:num) {
            System.out.println(v+"Data ");

        }
    }

    private static int[] inputdata(int[] num) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter integer:");
            num[i] = sc.nextInt();
        }
        return  num;
    }
}
