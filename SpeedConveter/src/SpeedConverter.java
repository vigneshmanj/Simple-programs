public class SpeedConverter {
public static long toMilesPerHour(double kilometersPerHour)
{
    if (kilometersPerHour<0)
    {
        return -1;
    }
    return Math.round(kilometersPerHour/1.609);
}
public static int printConversion(double kilometersPerHour)
{
    if (kilometersPerHour<0)
    {
        System.out.println("Invalid input");

    }
    else
    {
        long milesperhour=toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour+ " Km/h=" +milesperhour+ " mi/h");
    }
    return 0;
}
}
