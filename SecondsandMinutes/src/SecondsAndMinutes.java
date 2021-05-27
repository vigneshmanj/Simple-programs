
public class SecondsAndMinutes {
    public static void main(String args[])
    {
        System.out.println(getDurationString(86,57));
        System.out.println(getDurationString(56,60));
    }
    private static String getDurationString(int minutes,int seconds)
    {
        if ((minutes>=0) && (seconds>=0 && seconds<=59))
        {
         int hours=minutes/60;
         int remainingminutes=minutes%60;
         return hours+"h "+remainingminutes+"m "+seconds+"s ";
        }
        else
        {
            return "Invalid Value";

        }
        private static String getDurationString(int seconds)
            {
                if (seconds<0)
                {
                    return "Invalid Value";
                }

                minutes=seconds/60;
                 int remainingseconds=seconds*60;
                 return getDurationString(minutes,remainingseconds);


            }
    }
}
