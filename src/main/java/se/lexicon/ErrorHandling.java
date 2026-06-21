package se.lexicon;

import java.util.Scanner;

public class ErrorHandling {

    public static int ErrorHandling() {

        int i = 0;
        while (true) {
            Scanner input = new Scanner(System.in);
            String res = input.next();
            if (res.equalsIgnoreCase("Y")) {
                i = 1;
            } else if (res.equalsIgnoreCase("N")) {
                i = 0;
            } else {
                GlobalVars.LeftCalc("Try again."); // error catch
                continue;
            }
            return i;
        }
    }
}
