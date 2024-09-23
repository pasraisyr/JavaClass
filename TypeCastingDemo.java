public class TypeCastingDemo {

    public static void main(String[] args) {
        // Declare and initialize variables of different primitive types
        int intVar = 100;
        double doubleVar = 123.45;
        float floatVar = 12.34f;
        char charVar = 'A';
        boolean booleanVar = true;

        // Primitive type casting
        System.out.println("Primitive Type Casting:");

        // Casting double to int (narrowing conversion)
        int doubleToInt = (int) doubleVar;
        System.out.println("double to int: " + doubleToInt);

        // Casting float to int (narrowing conversion)
        int floatToInt = (int) floatVar;
        System.out.println("float to int: " + floatToInt);

        // Casting int to double (widening conversion)
        double intToDouble = intVar;
        System.out.println("int to double: " + intToDouble);

        // Casting char to int (ASCII value)
        int charToInt = (int) charVar;
        System.out.println("char to int (ASCII): " + charToInt);

        // Converting between primitive types using wrapper classes
        System.out.println("\nWrapper Class Conversions:");

        // Convert int to double using Double wrapper
        Double intToDoubleWrapper = Double.valueOf(intVar);
        System.out.println("int to Double (wrapper): " + intToDoubleWrapper);

        // Convert double to int using Integer wrapper (narrowing through intValue())
        Integer doubleToIntWrapper = Double.valueOf(doubleVar).intValue();
        System.out.println("double to Integer (wrapper): " + doubleToIntWrapper);

        // Convert float to double using Double wrapper
        Double floatToDoubleWrapper = Float.valueOf(floatVar).doubleValue();
        System.out.println("float to Double (wrapper): " + floatToDoubleWrapper);

        // Convert char to int using Integer wrapper (ASCII value)
        Integer charToIntWrapper = Character.valueOf(charVar).charValue();
        System.out.println("char to Integer (ASCII with wrapper): " + charToIntWrapper);

        // No conversion for boolean with other types
        System.out.println("boolean value (no casting possible): " + booleanVar);
    }
}
