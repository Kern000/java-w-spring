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

    }

}
