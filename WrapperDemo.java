public class WrapperDemo {

    public static void main(String[] args) {
        // Declare and initialize primitive variables
        int intVar = 10;
        double doubleVar = 20.5;
        float floatVar = 15.5f;
        char charVar = 'A';
        boolean booleanVar = true;

        // Create wrapper class objects and initialize them with primitive variables
        Integer intWrapper = Integer.valueOf(intVar);
        Double doubleWrapper = Double.valueOf(doubleVar);
        Float floatWrapper = Float.valueOf(floatVar);
        Character charWrapper = Character.valueOf(charVar);
        Boolean booleanWrapper = Boolean.valueOf(booleanVar);

        // Print primitive values
        System.out.println("Primitive values:");
        System.out.println("int: " + intVar);
        System.out.println("double: " + doubleVar);
        System.out.println("float: " + floatVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + booleanVar);

        // Print wrapper class values
        System.out.println("\nWrapper class values:");
        System.out.println("Integer: " + intWrapper);
        System.out.println("Double: " + doubleWrapper);
        System.out.println("Float: " + floatWrapper);
        System.out.println("Character: " + charWrapper);
        System.out.println("Boolean: " + booleanWrapper);
    }
}
