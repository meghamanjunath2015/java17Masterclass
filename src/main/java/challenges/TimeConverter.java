package challenges;
/*
1 min = 60 sec
1 hour = 60 min

hours = totalSeconds / 3600;
minutes = (totalSeconds % 3600) / 60;
seconds = totalSeconds % 60;
*/
public class TimeConverter extends BaseClass {
    public static void main(String[] args) {
        String time1 = convertTime(8779);
        String time2 = convertTime(400, 30);
        System.out.println(time1);
        System.out.println(time2);
    }

    private static String convertTime(int sec) {
        int hour = sec / 3600;
        int min = (sec % 3600) / 60;
        int seconds  = sec % 60;

        return String.format("%02d:%02d:%02d", hour, min, seconds);
    }

    private static String convertTime(int min, int sec) {
        if( sec > 0 && min > 0) {
            int totalSec = (min * 60) + sec;
            logger.info("Total Sec: {}", totalSec);
            return convertTime(totalSec);
        } else {
            return "Input has to be in positive numbers";
        }
    }

}
