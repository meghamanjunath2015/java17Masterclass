package challenges;
/*
1 min = 60 sec
1 hour = 60 min
seconds >= 0 && seconds <= 59

hours = totalSeconds / 3600;
minutes = (totalSeconds % 3600) / 60;
seconds = totalSeconds % 60;
*/
public class ConvertDuration extends BaseClass {
    public static void main(String[] args) {
        String time1 = getDurationString(3456);
        String time2 = getDurationString(8, 30);
        System.out.println(time1);
        //System.out.println(time2);
    }

    private static String getDurationString(int sec) {
        int hour = sec / 3600;
        int min = (sec % 60) / 60;
        int seconds  = sec % 60;

        return String.format("%02d:%02d:%02d", hour, min, seconds);
    }

    private static String getDurationString(int min, int sec) {
        int totalSec = (min *  60) + sec;
        logger.info(totalSec);
        String timeInFormat = getDurationString(totalSec);
        return timeInFormat;
    }

}
