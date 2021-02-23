package LAB8;

public class circle extends Object2D {
    //
    private  static  final double PI=3.141;
    //attribute
    private double radius;

    //constructor

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calArea() {
        //circle area = PI * (r *r) ;
        double area = PI * radius * radius;
        super.setArea(area);
    }
}
