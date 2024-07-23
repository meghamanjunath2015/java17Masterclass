package challenges.ControlFlow;

import challenges.BaseClass;

public class Pattern extends BaseClass {
    public static void main(String[] args) {
        pyramid(10);
    }

    public static void pyramid(int rows) {
        //each row
        for (int i = 0; i < rows; i++) {
            //for spaces before stars
            for (int j = rows-i-1; j >=1; j--)
                System.out.print("S");
            //stars in each row
            for (int j=0; j<=i;j++)
                System.out.print("* ");
            //move to next line after printing each row
            System.out.println();
        }
    }

}
