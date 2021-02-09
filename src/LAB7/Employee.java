package LAB7;

public class Employee {
    //attributes
    private String name;
    private  int age;
    private String position;
    private double salary;
    //default constructor
    public  Employee(){}
    //assign constructor
    public  Employee(String name, int age, String position,double salary){
        //assign data to class attributes
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;


    }
    //display object data
    public void displayData(){
        System.out.println("Employee Name:"+this.name);
        System.out.println("Employee age:"+this.age);
        System.out.println("Employee position:"+this.position);
        System.out.println("Employee salary:"+this.salary);
    }
    //getter and setter methods
    //getter => read
    //setter => update
    public String getName(){
        return  this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getposition(){
        return  this.position;
    }
    public void setposition(String position){
        this.position = position;
    }

    public double getsalary(){
        return  this.salary;
    }
    public void setsalary(double salary){
        this.salary = salary;
    }




}//calass
