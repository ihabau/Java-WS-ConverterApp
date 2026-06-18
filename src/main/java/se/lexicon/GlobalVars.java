package se.lexicon;
import java.util.ArrayList;
public class GlobalVars {

    public static final String devider = "|==================================================|";
    public static final int programLength = devider.length();

    public static ArrayList<String> rawContextMenu = new ArrayList<>();
    public static ArrayList<String> contextMenu = new ArrayList<>();

    public static String[] rawChoices;
    public static String[] Choices;


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

    public static void LeftCalc(String input) {
        int inputLength = input.length();
        int rightSide = (programLength -2);

        String format = "|" + "%-" + rightSide + "s|\n";
        //System.out.println(format);
        System.out.printf( format, input);

    }
}


