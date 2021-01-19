package LAB7;

public class StudentApp {
    public static void main(String[] args) {
        //
        Student std1 = new Student();

        std1.introduce();
        //
        std1.name= "Ratchaneekorn";
        std1.age= 21;
        std1.major="MIT";

        std1.introduce();

        Student std2 = new Student();
        std2.name= "pla";
        std2.age= 22;
        std2.major="AC";
        std2.introduce();

        std2.major="MIT";
        std2.introduce();

        std1.changeFaculty("Engineer RUTS");
        std1.introduce();
        std2.introduce();

    }
}
