package challenges;

public class PrintEquality {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    private static final String ALL_EQUAL_MESSAGE = "All numbers are equal";
    private static final String NEITHER_ALL_EQUAL_MESSAGE = "Neither all are equal or different";
    private static final String ALL_DIFF_MESSAGE = "All numbers are different";

    public static void printEqual(int a, int b, int c){
        if(a < 0 || b < 0 || c < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        else if(a == b && b == c && c == a){
            System.out.println(ALL_EQUAL_MESSAGE);
        }
        else if((a==b)|| (b==c) || (c == a)){
            System.out.println(NEITHER_ALL_EQUAL_MESSAGE);
        }
        else{
            System.out.println(ALL_DIFF_MESSAGE);
        }
    }

    public static void main(String[] args) {
    printEqual(2, 3, 3);
    printEqual(100, 100, 100);
    printEqual(-233, 333, 333);
    }
}
