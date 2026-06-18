package se.lexicon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Logic {

    public static void Logic() {

        menyGen(0,"", 0);

        System.out.println(GlobalVars.devider);
        GlobalVars.centerCalc("Type 1-" + GlobalVars.contextMenu.toArray().length + " converter.");
        Scanner input = new Scanner(System.in);
        int con = input.nextInt() - 1;
        String converterType = GlobalVars.contextMenu.get(con);

        menyGen(1, converterType,0);
        // --- change unto a method
        System.out.println(GlobalVars.devider);
        GlobalVars.centerCalc("Type 1-" + GlobalVars.contextMenu.toArray().length + " converter.");
        input = new Scanner(System.in);
        con = input.nextInt() - 1;
        converterType = GlobalVars.contextMenu.get(con);
        //----

        GlobalVars.centerCalc("Type the value you  wnat converted");
        input = new Scanner(System.in);
        double value = input.nextDouble();
        menyGen(2, converterType,value);



    }

    public static Object[] ObjectRet(Object reg) {

        Object[] row = (Object[]) reg;
        return row;
    }

    public static void menyGen(int index, String type, double value) {

        double res = value;
        GlobalVars.rawContextMenu.clear();
        GlobalVars.contextMenu.clear();

        for (Object regi : ConversionRegister.Register) {
            Object[] row = ObjectRet(regi);
            Object[] row2 = ObjectRet(row[2]);

            if (row[0].toString().equalsIgnoreCase(type) && index == 1) {   //here we print menu 1
                GlobalVars.rawContextMenu.add(row[1].toString());
            }

            if ( index == 0 ) {
                GlobalVars.rawContextMenu.add(row[0].toString()); // here we print menu 2 based on menu 1 choice

            }
            if ( row[1].toString().equalsIgnoreCase(type) && index == 2 ) { // here we print result
                //Object[] formula = (Object[]) row[2];
                //System.out.println(row2[0]);

                int counter = row2.length / 2 + 1;

                for (int i = 0; i < counter; i++) {
                    Object regi2 = row2[i];
                    int index2 = i + 1;

                    if (regi2.toString().equalsIgnoreCase("+")) {
                        res = Calc.addition(res, (Double) row2[index2]);
                    }

                    if (regi2.toString().equalsIgnoreCase("-")) {
                        res = Calc.subtraction(res, (Double) row2[index2]);
                    }

                    if (regi2.toString().equalsIgnoreCase("*")) {
                        res = Calc.multiplication(res, (Double) row2[index2]);
                    }

                    if (regi2.toString().equalsIgnoreCase("/")) {
                        res = Calc.division(res, (Double) row2[index2]);
                    }

                }

                String result = "Result: " + value + " to " + res + " " + row[1];
                GlobalVars.LeftCalc(result);
                //System.out.println("Result: " + value + " to " + res + " " + row[1]);

            }
        }
        LinkedHashSet<String> set = new LinkedHashSet<>(GlobalVars.rawContextMenu);
        GlobalVars.contextMenu.addAll(set);

        loopMenu(GlobalVars.contextMenu);


    }

    public static void loopMenu(ArrayList reg) {

        int index = 1;
        for( Object entry : reg ) {
            String text = index + ": " + entry;
            GlobalVars.LeftCalc(text);
            //System.out.println(index + ": " + entry);
            index += 1;
        }

    }



}
