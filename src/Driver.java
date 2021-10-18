public class Driver
{
    public static void main (String[] args)
    {
        System.out.println(myGrade(140));
        System.out.println(myGrade(100));
        System.out.println(myGrade(0));
        System.out.println(myGrade(50));

        System.out.println(percentGrade(140, 50));
        System.out.println(percentGrade(60, 95));
        System.out.println(percentGrade(121, 100));
        System.out.println(percentGrade(40,40));
        System.out.println(percentGrade(50, 50));
        System.out.println(percentGrade(35, 39));
    }//end main method

    public static String myGrade(int hwkMin)
    {
        String grade = "";
        if(hwkMin >= 120)
        {
            grade = "A"; //you get an A
        }
        else if (hwkMin >= 80)
        {
            grade = "B";
        }
        else if(hwkMin >= 50)
        {
            grade = "C";
        }
        else
        {
            grade = "F";
        }
        return grade;
    }//end method myGrade

    public static String percentGrade(int hwkMin, int hwkPer)
    {
        String grade = "";
        if ((hwkMin > 120) || (hwkPer > 90))//90% perc or 120 min
        {
            grade = "A";
        }
        else if ((hwkMin >= 50) || (hwkPer >= 50))
        {
            grade = "B";
        }
        else if ((hwkMin >= 40) || (hwkPer >= 40))
        {
            grade = "D";
        }
        else if ((hwkMin >= 60) || (hwkPer >= 60))
        {
            grade = "C";
        }
        else
        {
            grade = "F";
        }
        return grade;
    }//end method percentGrade

}//end driver class