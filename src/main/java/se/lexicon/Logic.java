package se.lexicon;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Logic {

    public static void Logic() {

        //we add the list to the arraylist for the choices

        for( Object regi : ConversionRegister.Register ) {

           Object[] row = (Object[]) regi;
           Object[] row2 = (Object[]) row[2];

           GlobalVars.rawContextMenu.add(row[0].toString());
           System.out.println(row[1] + " " + row2[0] + " " + row2[1]);
        }

        LinkedHashSet<String> set = new LinkedHashSet<>(GlobalVars.rawContextMenu);
        GlobalVars.contextMenu.addAll(set);

        int index = 1;
        for( String entry : GlobalVars.contextMenu ) {
            System.out.println(index + ": " + entry);
            index += 1;
        }

    }




}
