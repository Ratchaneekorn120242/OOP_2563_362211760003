package LAB7;

public class EmployeeApp {
    public static void main(String[] args) {

       //use default constructor
       Employee emp1 = new Employee();
       //assign constructor
        Employee emp2 = new Employee("Ratchaneekorn Tongwan",21,"Student",30000);


        //call displayData()
        emp1.displayData();
        emp2.displayData();

        //System.out.println(emp2.name);

        //assign data to emp1
        emp1.setName("Pla");
        emp1.setAge(21);
        emp1.setposition("Dean");
        emp1.setsalary(50000);

        emp1.displayData();
        System.out.println("Emp name:"+emp1.getName());






    }//main

}//class
