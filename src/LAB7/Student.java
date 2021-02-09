package LAB7;

public class Student {
    //claee attributes
    static  String fuculty = "MT RUTS";
    String name;
    int age;
    String major;

    //behavior
    //default constructor
    public Student(){
        //....
    }

    //behavior
  public void introduce(){
      System.out.println("My name is "+name);
      System.out.println("I am"+age+"years old");
      System.out.println("I studing in "+major);
      System.out.println("Faculty:"+fuculty);

  }
    public void changeFaculty(String newfac){

        fuculty = newfac;
    }
    }

