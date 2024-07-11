

public class StringBuffer1 {
    public static void main(String a[]){

        StringBuffer sb1 = new StringBuffer(); //String buffer is mutable string
        System.out.println(sb1.capacity()); //default give buffer of 16 chrs

        StringBuffer sb2 = new StringBuffer("hello"); //String buffer gives a buffer size (extra memory allocated to handle additions to the string)
        System.out.println(sb2.capacity()); //becomes 21 after adding 5 characters
        System.out.println(sb2.length());
        // everytime change data, if it consumes a continuous memory location inside heap memory, and if there is no contigious memory location next, it will relocate - this reduce the relocate
    }

}
