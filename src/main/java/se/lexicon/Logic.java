package se.lexicon;
import java.util.Scanner;

public class Logic {

    public static void Logic() {

        for( Object regi : ConversionRegister.Register ) {
           Object[] row = (Object[]) regi;
           System.out.println(row[1]);
        }

    }




}
