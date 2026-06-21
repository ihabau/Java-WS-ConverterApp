package se.lexicon;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        ConversionRegister.Register();
        while(true) {
            Greetings.Greetings();
            Logic.Logic();
            GlobalVars.LeftCalc("Continue? Y/N");
            int  index = ErrorHandling.ErrorHandling();
            if (index == 1) {continue;}
            if (index == 0) {
                Logic.loopMenu(GlobalVars.sessionHistory);
                GlobalVars.LeftCalc("Goodbye!");
                break;
            }

        }
    }
}
