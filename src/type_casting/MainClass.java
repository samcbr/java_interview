package type_casting;

public class MainClass {
    public static void main(String[] args) {
        typeCasteChar('a');
        typeCasteInt(97);
        typeCastFloat(97.5f);
        typeCastDouble(97.5);
    }

    public static void typeCasteChar(char charValue){
        int charValueToInt = charValue;
        double charValueToDouble = charValue;
        float charValueToFloat = charValue;

        System.out.println("char value " + charValue);
        System.out.println(charValueToInt);
        System.out.println(charValueToDouble);
        System.out.println(charValueToDouble);
        System.out.println(charValueToFloat);
    }

    public static void typeCasteInt(int intValue){
        char intValueToChar = (char) intValue;
        double intValueToDouble = intValue;
        float intValueToFloat = intValue;

        System.out.println("int value " + intValue);
        System.out.println(intValueToChar);
        System.out.println(intValueToDouble);
        System.out.println(intValueToFloat);
    }

    public static void typeCastFloat(float floatValue){
        char floatValueToChar = (char) floatValue;
        int floatValueToInt =(int) floatValue;
        double floatValueToDouble = floatValue;

        System.out.println("float value " + floatValue);
        System.out.println(floatValueToChar);
        System.out.println(floatValueToInt);
        System.out.println(floatValueToDouble);
    }

    public static void typeCastDouble(double doubleValue){
        char doubleValueToChar = (char) doubleValue;
        int doubleValueToInt =(int) doubleValue;
        float doubleValueToFloat =(float) doubleValue;

        System.out.println("double value " + doubleValue);
        System.out.println(doubleValueToChar);
        System.out.println(doubleValueToInt);
        System.out.println(doubleValueToFloat);
    }
}
