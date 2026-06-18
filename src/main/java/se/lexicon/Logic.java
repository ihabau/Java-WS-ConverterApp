package se.lexicon;
import java.util.LinkedHashSet;

public class Logic {

    public static void Logic() {

        //we add the list to the arraylist for the choices

        for( Object regi : ConversionRegister.Register ) {
            Object[] row = ObjectRet(regi);
           GlobalVars.rawContextMenu.add(row[0].toString());
           //System.out.println(row[0]);
        }

        LinkedHashSet<String> set = new LinkedHashSet<>(GlobalVars.rawContextMenu);
        GlobalVars.contextMenu.addAll(set);

        int index = 1;
        for( String entry : GlobalVars.contextMenu ) {
            String text = index + ": " + entry;
            GlobalVars.LeftCalc(text);
            //System.out.println(index + ": " + entry);
            index += 1;
        }

    }

    public static Object[] ObjectRet(Object reg) {

        Object[] row = (Object[]) reg;
        return row;
    }



}
