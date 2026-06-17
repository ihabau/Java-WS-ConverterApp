package se.lexicon;
import java.util.ArrayList;
import java.util.List;

public class ConversionRegister {

    public static List<Object> Register = new ArrayList<>();

    public static void Register() {
        Register.add(new Object[]{"Temperature Convert", "C to F", new Object[]{"*", 1.8, "+", 32.0}});
        Register.add(new Object[]{"Temperature Convert", "F to C", new Object[]{"-", 32, "/", 1.8}});
    }
}


// 1 have 3 inputs in array registe
// 2 firstinput is the name of the conversion type
// 3 second is the conversion way
// the rest is operators then numbers