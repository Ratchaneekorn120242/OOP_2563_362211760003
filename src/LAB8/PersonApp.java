package LAB8;

public class PersonApp {

    public static void main(String[] args) {


        //objects

        Person p1 = new Person();
        p1.setName("Ratchaneekorn");
        p1.setAge(22);


        Person p2 = new Teacher("RUTS");
        p2.setName("Ratchaneekorn");
        p2.setAge(22);

        Person p3 = new Doctor("Thangsong");
        p3.setName("pla");
        p3.setAge(22);

        //call introduce
        p1.introduce();
        p2.introduce();
        p3.introduce();

    }
}
