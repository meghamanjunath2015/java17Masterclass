package challenges;

/*
minutesInYear = 60 * 24 * 365 = 525600 minutes.
 */

public class MinutesToYearsDaysCal extends  BaseClass{
    public static void printYearsAndDays(long minutes){
        if(minutes <0){
            System.out.println("Invalid Value");
        }
        else{
            //calculate Year
            long minutesInYear = 60 * 24 * 365;
            long years = minutes / minutesInYear;
            logger.info(years);
            long remainingMinutes = minutes % minutesInYear;

            //calculate days
            long minutesInDay = 60 * 24;
            long days = remainingMinutes / minutesInDay;

            System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        }
    }

    public static void main(String[] args) {
        printYearsAndDays(1440);
        printYearsAndDays(8000000);
        printYearsAndDays(525600);
    }
}
