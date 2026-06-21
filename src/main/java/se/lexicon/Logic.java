package se.lexicon;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.time.Clock;

public class Logic {

    public static void Logic() {

        menyGen(0,"", 0);

        Scanner input = new Scanner(System.in);

        String converterType = getData();
        if (converterType.equalsIgnoreCase("exit")) {
            return;
        }
        menyGen(1, converterType,0);
        converterType = getData();


        if (converterType.equalsIgnoreCase("exit")) {
            return;
        }

        // added from big pickle for bmi calc
        if (converterType.equalsIgnoreCase("BMI")) {
            GlobalVars.centerCalc("Enter your weight (kg):");
            input = new Scanner(System.in);
            double weight = input.nextDouble();
            GlobalVars.centerCalc("Enter your height (m):");
            input = new Scanner(System.in);
            double height = input.nextDouble();
            double bmi = Calc.bmi(weight, height);
            String category = Calc.bmiCategory(bmi);
            String result = "BMI: " + String.format("%.1f", bmi) + " (" + category + ")";
            GlobalVars.LeftCalc(result);
            return;
        }
        // end of ai addition.

        GlobalVars.centerCalc("Type the value you want converted");
        input = new Scanner(System.in);

        double value = input.nextDouble();
        menyGen(2, converterType,value);



    }// -----------------------------------------

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

                int counter = row2.length - 1;

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

                res = Math.floor(res * 100.0) / 100.0;
                String result = "Result: " + value + row[3] + " to " + res + row[4];
                String entry = LocalDate.now() +  ": " + value + row[3] + " to " + res + row[4];
                GlobalVars.sessionHistory.add(entry);
                GlobalVars.LeftCalc(result);

            }

        }
        GlobalVars.rawContextMenu.add("Exit");
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

    public static String getData() {

        while (true) {

            Scanner input = new Scanner(System.in);
            try {
                System.out.println(GlobalVars.devider);
                GlobalVars.centerCalc("Type 1-" + GlobalVars.contextMenu.toArray().length + " converter.");

                int con = input.nextInt() - 1;
                if (con >= 0 && con < GlobalVars.contextMenu.size()) {
                    return GlobalVars.contextMenu.get(con);
                } else {
                    System.out.println("Number out of bound.");
                }
            } catch ( Exception e) {
                System.out.println("Try again.");
                input.next();
            }
        }
    }



}
