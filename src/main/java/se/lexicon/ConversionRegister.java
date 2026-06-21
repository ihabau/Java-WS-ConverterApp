package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class ConversionRegister {

    public static List<Object> Register = new ArrayList<>();

    public static void Register() {
        Register.clear();
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

        // ============ TIME ============
        Register.add(new Object[]{"Time Converter", "ms to s", new Object[]{"/", 1000.0}, "ms", "s"});
        Register.add(new Object[]{"Time Converter", "s to ms", new Object[]{"*", 1000.0}, "s", "ms"});
        Register.add(new Object[]{"Time Converter", "s to min", new Object[]{"/", 60.0}, "s", "min"});
        Register.add(new Object[]{"Time Converter", "min to s", new Object[]{"*", 60.0}, "min", "s"});
        Register.add(new Object[]{"Time Converter", "min to hr", new Object[]{"/", 60.0}, "min", "hr"});
        Register.add(new Object[]{"Time Converter", "hr to min", new Object[]{"*", 60.0}, "hr", "min"});
        Register.add(new Object[]{"Time Converter", "hr to day", new Object[]{"/", 24.0}, "hr", "day"});
        Register.add(new Object[]{"Time Converter", "day to hr", new Object[]{"*", 24.0}, "day", "hr"});
        Register.add(new Object[]{"Time Converter", "day to week", new Object[]{"/", 7.0}, "day", "week"});
        Register.add(new Object[]{"Time Converter", "week to day", new Object[]{"*", 7.0}, "week", "day"});
        Register.add(new Object[]{"Time Converter", "day to year", new Object[]{"/", 365.0}, "day", "year"});
        Register.add(new Object[]{"Time Converter", "year to day", new Object[]{"*", 365.0}, "year", "day"});
        Register.add(new Object[]{"Time Converter", "week to year", new Object[]{"/", 52.0}, "week", "year"});
        Register.add(new Object[]{"Time Converter", "year to week", new Object[]{"*", 52.0}, "year", "week"});
        Register.add(new Object[]{"Time Converter", "s to hr", new Object[]{"/", 3600.0}, "s", "hr"});
        Register.add(new Object[]{"Time Converter", "hr to s", new Object[]{"*", 3600.0}, "hr", "s"});
        Register.add(new Object[]{"Time Converter", "min to day", new Object[]{"/", 1440.0}, "min", "day"});
        Register.add(new Object[]{"Time Converter", "day to min", new Object[]{"*", 1440.0}, "day", "min"});
        Register.add(new Object[]{"Time Converter", "s to day", new Object[]{"/", 86400.0}, "s", "day"});
        Register.add(new Object[]{"Time Converter", "day to s", new Object[]{"*", 86400.0}, "day", "s"});

        // ============ DATA STORAGE ============
        Register.add(new Object[]{"Data Storage Converter", "bit to byte", new Object[]{"/", 8.0}, "bit", "byte"});
        Register.add(new Object[]{"Data Storage Converter", "byte to bit", new Object[]{"*", 8.0}, "byte", "bit"});
        Register.add(new Object[]{"Data Storage Converter", "byte to KB", new Object[]{"/", 1024.0}, "byte", "KB"});
        Register.add(new Object[]{"Data Storage Converter", "KB to byte", new Object[]{"*", 1024.0}, "KB", "byte"});
        Register.add(new Object[]{"Data Storage Converter", "KB to MB", new Object[]{"/", 1024.0}, "KB", "MB"});
        Register.add(new Object[]{"Data Storage Converter", "MB to KB", new Object[]{"*", 1024.0}, "MB", "KB"});
        Register.add(new Object[]{"Data Storage Converter", "MB to GB", new Object[]{"/", 1024.0}, "MB", "GB"});
        Register.add(new Object[]{"Data Storage Converter", "GB to MB", new Object[]{"*", 1024.0}, "GB", "MB"});
        Register.add(new Object[]{"Data Storage Converter", "GB to TB", new Object[]{"/", 1024.0}, "GB", "TB"});
        Register.add(new Object[]{"Data Storage Converter", "TB to GB", new Object[]{"*", 1024.0}, "TB", "GB"});
        Register.add(new Object[]{"Data Storage Converter", "byte to MB", new Object[]{"/", 1048576.0}, "byte", "MB"});
        Register.add(new Object[]{"Data Storage Converter", "MB to byte", new Object[]{"*", 1048576.0}, "MB", "byte"});
        Register.add(new Object[]{"Data Storage Converter", "KB to GB", new Object[]{"/", 1048576.0}, "KB", "GB"});
        Register.add(new Object[]{"Data Storage Converter", "GB to KB", new Object[]{"*", 1048576.0}, "GB", "KB"});
        Register.add(new Object[]{"Data Storage Converter", "MB to TB", new Object[]{"/", 1024.0}, "MB", "TB"});
        Register.add(new Object[]{"Data Storage Converter", "TB to MB", new Object[]{"*", 1024.0}, "TB", "MB"});
        Register.add(new Object[]{"Data Storage Converter", "byte to GB", new Object[]{"/", 1073741824.0}, "byte", "GB"});
        Register.add(new Object[]{"Data Storage Converter", "GB to byte", new Object[]{"*", 1073741824.0}, "GB", "byte"});
        Register.add(new Object[]{"Data Storage Converter", "KB to TB", new Object[]{"/", 1073741824.0}, "KB", "TB"});
        Register.add(new Object[]{"Data Storage Converter", "TB to KB", new Object[]{"*", 1073741824.0}, "TB", "KB"});
        // ============ SPEED ============
        Register.add(new Object[]{"Speed Converter", "m/s to km/h", new Object[]{"*", 3.6}, "m/s", "km/h"});
        Register.add(new Object[]{"Speed Converter", "km/h to m/s", new Object[]{"/", 3.6}, "km/h", "m/s"});
        Register.add(new Object[]{"Speed Converter", "m/s to km/s", new Object[]{"/", 1000.0}, "m/s", "km/s"});
        Register.add(new Object[]{"Speed Converter", "km/s to m/s", new Object[]{"*", 1000.0}, "km/s", "m/s"});
        Register.add(new Object[]{"Speed Converter", "km/h to km/s", new Object[]{"/", 3600.0}, "km/h", "km/s"});
        Register.add(new Object[]{"Speed Converter", "km/s to km/h", new Object[]{"*", 3600.0}, "km/s", "km/h"});

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