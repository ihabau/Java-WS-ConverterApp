package se.lexicon;

public class Calc {

    public static double addition( double a, double b ) {
        return  a + b;
    }


    public static double subtraction( double a, double b ) {
        return  a - b;
    }

    public static double multiplication( double a, double b ) {
        return  a * b;
    }

    public static double division( double a, double b ) {
        return  a / b;
    }

    //big picle added the bmi calc i didnt think of it
    public static double bmi(double weightKg, double heightM) {
        return weightKg / (heightM * heightM);
    }

    public static String bmiCategory(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25.0) return "Normal weight";
        if (bmi < 30.0) return "Overweight";
        return "Obese";
    }
}
