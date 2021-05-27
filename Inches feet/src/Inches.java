public class Inches{
public static void main (String args[]) {
    calcFeetAndInchesToCentimeters(1,12);

}


    public static int calcFeetAndInchesToCentimeters(double feet,double inches)
{
    if ((feet>=0) && (inches>=0 && inches<=12) )
    {
        double centimers=2.54*12*feet;
         centimers+=inches*2.54;

        System.out.println(feet+"feet, " +inches+ " inches, "+centimers+"centimeters ");

    }
    else
    {
        return -1;
    }

return 0;
}
}