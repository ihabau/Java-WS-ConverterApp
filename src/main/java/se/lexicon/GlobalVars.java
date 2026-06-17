package se.lexicon;

public class GlobalVars {

    public static final String devider = "|==================================================|";
    public static final int programLength = devider.length();

    public static void lengthCalc(String input) {
        int inputLength = input.length();
        int leftSide = (programLength - inputLength -4) /  2;
        int rightSide = 0;


        if (inputLength % 2 == 0) {
            rightSide = leftSide;
        } else {
            rightSide = leftSide + 1;
        }
        String format = "|%" + leftSide + "s %s %" + rightSide + "s|\n";
        System.out.printf( format, "" , input, "" );

    }

}


