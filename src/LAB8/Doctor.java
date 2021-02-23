package LAB8;

public class Doctor extends Person {

    private String hospital;

    public Doctor() {
    }

    public Doctor(String hospital) {
        this.hospital = hospital;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    //cons

    //getter

    public void introduce(){
        super.introduce();
        System.out.println("I am a doctor at"+hospital+"hospital");
    }





}
