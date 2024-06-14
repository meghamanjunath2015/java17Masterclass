package challenges;

public class NatoPhonetic extends  BaseClass{
    public static void main(String[] args) {
        System.out.println(natoLettersAtoE('A'));
        System.out.println(natoLettersAtoE('B'));
        System.out.println(natoLettersAtoE('C'));
        System.out.println(natoLettersAtoE('Z'));
        System.out.println(natoLettersAtoE('D'));
        System.out.println(natoLettersAtoE('E'));

    }
    public static String natoLettersAtoE(char letter){
        return switch (letter){
            case 'A' -> "Able";
            case 'B'-> "Baker";
            case 'C'-> "Charlie";
            case 'D'-> "Dog";
            case 'E'-> "Easy";
            default -> "Invalid Input";
        };
    }
}
