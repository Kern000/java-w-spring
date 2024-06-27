// jshell terminal can experiment
// Application on JVM is platform indep but JVM itself is platform dep
// JVM contained in Java runtime env (JVM also hv the libraries), which is contained in Java JDK (only used by devs)
// compile to byte code as JVM only understands byte code (The class file is the byte code)
// specify first file, that file will have the main method (like index.js)

public class CoreJava1 {

    // = assignment operator
    // revision of primitive data types: int, float, char, boolean
    // int -> subtype: byte, short, int, long
    // float -> double, float
    // int size is 4 bytes -> -2^31 to 2^31 - 1
    // long is 8 bytes -> -2^63 to 2^63 - 1
    // short is 2 bytes -> -2^-15 to 2^15 - 1
    // byte is 1 byte -> -2^-7 to 2^7 - 1 = -128 to 127;
    // float is 4 bytes // for limited precision
    // double is 8 bytes -> this is the defautl
    // float num = 5.6f; //need the f behind
    // char is 2 bytes -> Unicode not ASCII
    // boolean is only true and false, not (0,1);
    // possible lossy conversion from int to byte -> when the number is not in range of the data type of your variable;

    public static void main(String args[]){

        int num1 = 3;
        int num2 = 5;
        long l = 5854l;
        float f = 5.8f;
        char c = 'k';
        boolean b = true;
        int num3 = 585; // this is base 10;
        int num4 = 0b101; // this is base 2; 101 is 5;
        // 2^2  2^1  2^0 -> multiply the respective bit with ea power of 2: hence is 5;
        int num5 = 0x7e; // hexadecimal;
        int num6 = 100_000_000;
        double num7 = 56; // auto convert to double
        double num8 = 12e10; // This is exponential
        char a = 'a';
        System.out.println(a);
        a++;
        System.out.println(a); //this is now b

        System.out.println("Hello world");
        System.out.print(3+5);
        System.out.println(num1 + num2);
        System.out.println(l + f);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num8);
    }


}
