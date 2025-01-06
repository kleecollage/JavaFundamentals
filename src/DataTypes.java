import java.sql.SQLOutput;

public class DataTypes {
    public static void main(String[] args) {
        // Java Data Types
        // INTEGERS (Default value = 0)
        byte typeByte = 127;
        System.out.println("Byte: " + typeByte);
        short typeShort = 32767;
        System.out.println("Short: " + typeShort);
        int typeInt = 2147483647;
        System.out.println("Int: " + typeInt);
        long typeLong = 9223372036854775807L;
        System.out.println("Long: " + typeLong);
        // FLOAT POINT (Default value = 0.0)
        float typeFloat = 3.14159265f;
        System.out.println("Float: " + typeFloat);
        double typeDouble = 3.14159265D;
        System.out.println("Double: " + typeFloat);
        // CHARACTER (Unicode, (Default value = '\u0000'))
        char typeChar = 'A';
        System.out.println( "Char: " + typeChar);
        typeChar = 65;
        System.out.println( "Char: " + typeChar);
        typeChar = '@';
        System.out.println( "Char: " + typeChar);
        // BOOLEAN (Default value = false)
        boolean typeBoolean = true;
        System.out.println("Boolean: " + typeBoolean);
        typeBoolean = false;
        System.out.println("Boolean: " + typeBoolean);
        // OBJECT (Default value = null)
        String name = "John Doe";
        System.out.println("Object String: " + name);
    }
}
