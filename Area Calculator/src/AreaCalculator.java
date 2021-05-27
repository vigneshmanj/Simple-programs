import static java.lang.Math.PI;

public class AreaCalculator {
    public static void main(String args[])
    {
        System.out.println(area(8.5));
        System.out.println(area(5,7));
    }
    public static double area(double radius) {
        if (radius <= 0) {
            return -1.0;
        }
        double Radius = PI*Math.pow(radius,2);

        return Radius;
    }
    public static double area(double x,double y)
    {
        if (x<=0 || y<=0)
        {
            return -1;
        }
        double rectangle=x*y;
        return rectangle;

    }
}
