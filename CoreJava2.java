//runtime error - kind of error will be thrown if the main method is not found in the Java program?

// type conversion and casting;
// cant change the type of the variable;
// explict type conversion is called casting


public class CoreJava2 {
    
    public static void main(String args[]){

        byte b = 127;
        int a = 256;
        int c = 12;
        a = b; // but cannot b = a; b is now int;
        b = (byte) c; //type casting int 12 to byte 12;
        System.out.println(b);

        // type casting float to int will lose the int;
        float float1 = 5.6f;
        int int1 = (int) float1;
        System.out.println(int1);

        //concept of modulus
        byte byte1 = 127;
        int int2 = 257;
        byte1 = (byte) int2;
        System.out.println(byte1);
        // the output will be 1, which is the remainder
        // cannot auto reassign int value to byte since byte is smaller
        // casting also works w objects

        byte a1 = 10;
        byte b1 = 30;
        int result = a1 * b1;
        System.out.println(result);
        // this is type promotion

        // valid way to repr long literal
        long l1 = 123L; // the caps for l fon't matter
        long l2 = 1231;
        long l3 = 0b1010L; // this is 10; 2^3 * 1, 2^2 * 0, 2^1 * 1, 2^0 * 0;
        float f1 = 0.05F;
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(f1);

        char c1 = 97; // 97 here refer to ASCII/unicode point for lowercase 'a'; type conversion by assigning int to char variable;
        System.out.println(c1);
        
        // In unsigned integers, high order but is the one w highest arith value -> the most dig digit of a decimal integer; -> aka highest power of 2 in the number;
        // In signed integers, the high-order bit typically indicates the sign of the number when using two's complement representation, which is the most common method for representing signed integers in modern computers.
        // If the high-order bit is 0, the number is positive.
        // If the high-order bit is 1, the number is negative

    }

}
