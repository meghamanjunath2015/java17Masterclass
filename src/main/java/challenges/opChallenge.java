package challenges;

public class opChallenge {
    public static void main(String[] args) {
        double a = 20.00d;
        double b = 80.00d;
        double c = (a + b) * 100d;
        double reminder = c % 40.00d;
        System.out.println("reminder:" + reminder);
        boolean isReminderZero = (reminder == 0) ? true : false;
        System.out.println(isReminderZero);
    }
}
