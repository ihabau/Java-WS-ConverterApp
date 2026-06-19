package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class ConversionRegister {

    public static List<Object> Register = new ArrayList<>();

    public static void Register() {
        CurrencyRates.fetchRates();
        // populated by big picle opencode ai
        // ============ TEMPERATURE ============
        Register.add(new Object[]{"Temperature Converter", "C to F", new Object[]{"*", 1.8, "+", 32.0}, "C", "F"});
        Register.add(new Object[]{"Temperature Converter", "F to C", new Object[]{"-", 32.0, "/", 1.8}, "F", "C"});
        Register.add(new Object[]{"Temperature Converter", "C to K", new Object[]{"+", 273.15}, "C", "K"});
        Register.add(new Object[]{"Temperature Converter", "K to C", new Object[]{"-", 273.15}, "K", "C"});
        Register.add(new Object[]{"Temperature Converter", "F to K", new Object[]{"-", 32.0, "/", 1.8, "+", 273.15}, "F", "K"});
        Register.add(new Object[]{"Temperature Converter", "K to F", new Object[]{"-", 273.15, "*", 1.8, "+", 32.0}, "K", "F"});

        // ============ LENGTH ============
        // Metric to Metric
        Register.add(new Object[]{"Length Converter", "mm to cm", new Object[]{"/", 10.0}, "mm", "cm"});
        Register.add(new Object[]{"Length Converter", "cm to mm", new Object[]{"*", 10.0}, "cm", "mm"});
        Register.add(new Object[]{"Length Converter", "cm to m", new Object[]{"/", 100.0}, "cm", "m"});
        Register.add(new Object[]{"Length Converter", "m to cm", new Object[]{"*", 100.0}, "m", "cm"});
        Register.add(new Object[]{"Length Converter", "m to km", new Object[]{"/", 1000.0}, "m", "km"});
        Register.add(new Object[]{"Length Converter", "km to m", new Object[]{"*", 1000.0}, "km", "m"});
        Register.add(new Object[]{"Length Converter", "mm to m", new Object[]{"/", 1000.0}, "mm", "m"});
        Register.add(new Object[]{"Length Converter", "m to mm", new Object[]{"*", 1000.0}, "m", "mm"});
        Register.add(new Object[]{"Length Converter", "mm to km", new Object[]{"/", 1000000.0}, "mm", "km"});
        Register.add(new Object[]{"Length Converter", "km to mm", new Object[]{"*", 1000000.0}, "km", "mm"});
        Register.add(new Object[]{"Length Converter", "cm to km", new Object[]{"/", 100000.0}, "cm", "km"});
        Register.add(new Object[]{"Length Converter", "km to cm", new Object[]{"*", 100000.0}, "km", "cm"});

        // Imperial to Imperial
        Register.add(new Object[]{"Length Converter", "in to ft", new Object[]{"/", 12.0}, "in", "ft"});
        Register.add(new Object[]{"Length Converter", "ft to in", new Object[]{"*", 12.0}, "ft", "in"});
        Register.add(new Object[]{"Length Converter", "ft to yd", new Object[]{"/", 3.0}, "ft", "yd"});
        Register.add(new Object[]{"Length Converter", "yd to ft", new Object[]{"*", 3.0}, "yd", "ft"});
        Register.add(new Object[]{"Length Converter", "yd to mi", new Object[]{"/", 1760.0}, "yd", "mi"});
        Register.add(new Object[]{"Length Converter", "mi to yd", new Object[]{"*", 1760.0}, "mi", "yd"});
        Register.add(new Object[]{"Length Converter", "in to yd", new Object[]{"/", 36.0}, "in", "yd"});
        Register.add(new Object[]{"Length Converter", "yd to in", new Object[]{"*", 36.0}, "yd", "in"});
        Register.add(new Object[]{"Length Converter", "in to mi", new Object[]{"/", 63360.0}, "in", "mi"});
        Register.add(new Object[]{"Length Converter", "mi to in", new Object[]{"*", 63360.0}, "mi", "in"});
        Register.add(new Object[]{"Length Converter", "ft to mi", new Object[]{"/", 5280.0}, "ft", "mi"});
        Register.add(new Object[]{"Length Converter", "mi to ft", new Object[]{"*", 5280.0}, "mi", "ft"});

        // Metric to Imperial
        Register.add(new Object[]{"Length Converter", "mm to in", new Object[]{"/", 25.4}, "mm", "in"});
        Register.add(new Object[]{"Length Converter", "in to mm", new Object[]{"*", 25.4}, "in", "mm"});
        Register.add(new Object[]{"Length Converter", "cm to in", new Object[]{"/", 2.54}, "cm", "in"});
        Register.add(new Object[]{"Length Converter", "in to cm", new Object[]{"*", 2.54}, "in", "cm"});
        Register.add(new Object[]{"Length Converter", "m to ft", new Object[]{"*", 3.28084}, "m", "ft"});
        Register.add(new Object[]{"Length Converter", "ft to m", new Object[]{"/", 3.28084}, "ft", "m"});
        Register.add(new Object[]{"Length Converter", "m to yd", new Object[]{"*", 1.09361}, "m", "yd"});
        Register.add(new Object[]{"Length Converter", "yd to m", new Object[]{"/", 1.09361}, "yd", "m"});
        Register.add(new Object[]{"Length Converter", "km to mi", new Object[]{"/", 1.609344}, "km", "mi"});
        Register.add(new Object[]{"Length Converter", "mi to km", new Object[]{"*", 1.609344}, "mi", "km"});

        // ============ WEIGHT ============
        // Metric to Metric
        Register.add(new Object[]{"Weight Converter", "mg to g", new Object[]{"/", 1000.0}, "mg", "g"});
        Register.add(new Object[]{"Weight Converter", "g to mg", new Object[]{"*", 1000.0}, "g", "mg"});
        Register.add(new Object[]{"Weight Converter", "g to kg", new Object[]{"/", 1000.0}, "g", "kg"});
        Register.add(new Object[]{"Weight Converter", "kg to g", new Object[]{"*", 1000.0}, "kg", "g"});
        Register.add(new Object[]{"Weight Converter", "kg to tonne", new Object[]{"/", 1000.0}, "kg", "tonne"});
        Register.add(new Object[]{"Weight Converter", "tonne to kg", new Object[]{"*", 1000.0}, "tonne", "kg"});
        Register.add(new Object[]{"Weight Converter", "mg to kg", new Object[]{"/", 1000000.0}, "mg", "kg"});
        Register.add(new Object[]{"Weight Converter", "kg to mg", new Object[]{"*", 1000000.0}, "kg", "mg"});
        Register.add(new Object[]{"Weight Converter", "g to tonne", new Object[]{"/", 1000000.0}, "g", "tonne"});
        Register.add(new Object[]{"Weight Converter", "tonne to g", new Object[]{"*", 1000000.0}, "tonne", "g"});

        // Imperial to Imperial
        Register.add(new Object[]{"Weight Converter", "oz to lb", new Object[]{"/", 16.0}, "oz", "lb"});
        Register.add(new Object[]{"Weight Converter", "lb to oz", new Object[]{"*", 16.0}, "lb", "oz"});
        Register.add(new Object[]{"Weight Converter", "lb to stone", new Object[]{"/", 14.0}, "lb", "stone"});
        Register.add(new Object[]{"Weight Converter", "stone to lb", new Object[]{"*", 14.0}, "stone", "lb"});
        Register.add(new Object[]{"Weight Converter", "oz to stone", new Object[]{"/", 224.0}, "oz", "stone"});
        Register.add(new Object[]{"Weight Converter", "stone to oz", new Object[]{"*", 224.0}, "stone", "oz"});

        // Metric to Imperial
        Register.add(new Object[]{"Weight Converter", "g to oz", new Object[]{"/", 28.3495}, "g", "oz"});
        Register.add(new Object[]{"Weight Converter", "oz to g", new Object[]{"*", 28.3495}, "oz", "g"});
        Register.add(new Object[]{"Weight Converter", "kg to lb", new Object[]{"*", 2.20462}, "kg", "lb"});
        Register.add(new Object[]{"Weight Converter", "lb to kg", new Object[]{"/", 2.20462}, "lb", "kg"});
        Register.add(new Object[]{"Weight Converter", "kg to stone", new Object[]{"/", 6.35029}, "kg", "stone"});
        Register.add(new Object[]{"Weight Converter", "stone to kg", new Object[]{"*", 6.35029}, "stone", "kg"});

        // ============ BMI ============
        Register.add(new Object[]{"BMI Calculator", "BMI", new Object[]{}, "kg/m", ""});
        // when asked big picle to add currency conversion i thought it would add static once but it add a function
        // get from api
        // ============ CURRENCY ============
        String[] currencies = {"EUR", "SEK", "DKK", "NOK", "USD", "CAD", "AUD"};
        for (int i = 0; i < currencies.length; i++) {
            for (int j = 0; j < currencies.length; j++) {
                if (i == j) continue;
                String from = currencies[i];
                String to = currencies[j];
                double fromRate = CurrencyRates.getRate(from);
                double toRate = CurrencyRates.getRate(to);
                Object[] formula;
                if (from.equals("EUR")) {
                    formula = new Object[]{"*", toRate};
                } else if (to.equals("EUR")) {
                    formula = new Object[]{"/", fromRate};
                } else {
                    formula = new Object[]{"/", fromRate, "*", toRate};
                }
                Register.add(new Object[]{"Currency Converter", from + " to " + to, formula, from, to});
            }
        }
    }
}