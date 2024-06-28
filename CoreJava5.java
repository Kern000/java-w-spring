//loops
public class CoreJava5 {
    
    public static void main(String a[]){

        for (int x=0; x < 4; x++){
            System.out.println("Hi");
        }

        int x = 0; //sentinel variable
        while (x < 4){
            System.out.println("bye");
            x++;
        }

            // infinite loop can fill the RAM and crash the app;

       // Do while loop, ensures execute once at least
        int i = 5;
        do {
            System.out.println("This will do even if condition false");
            i++;
        }
        while (i <= 4);
        // do while loop is exit control loop

        int b,c;
        b = c = 10; //right to left evaluation in this case
        System.out.println(b);
        System.out.println(c);

        int d = 3;
        int e = 6;
        // ~ in Java is bitwise NOT operator; converts 0 bit to 1 and 1 bit to 0; It operates on binary (bitwise) representation of an integer
        int result2 = (~d & e) | (d & ~e);
        System.out.println(result2);
        // in binary d = 0000 0011
        // binary e = 0000 0110
        // ~ inverts the bits of d = 1111 1100
        // ~ inverts the bits of e = 1111 1001
        // 1 and 0 becomes 0, 1 & 1 will be 1;
        // so bit by bit, first expression becomes 00000100 which is 4
        // and 2nd expression is 0000 0001; which is 1;
        // so bit wise | will give 0000 0101 which is 5;
        // thus it prints out 5;


        // if(1) {

        //     System.out.println("Navin Reddy");
            
        // }
        // This gives error, because in java, 1 cannot be converted to boolean (not truthy like in js)


        int x1 = 5;

        int y1 = 10;
        
        int z1 = (x1++ > 5 && y1-- < 10) ? x1-- : y1;

        System.out.println(x1); //6 - post increment, within expression it is still 5 hence evaluate to be false
        System.out.println(y1); // 10 since y1-- not evaluated because short circuited by first expression falsy hence y1 is 10;
        System.out.println(z1); //10

        int x2 = 5;
        int y2 = 10;       
        int z2 = (++x2 > 5 && --y2 < 10) ? x2-- : y2;

        System.out.println(x2); // returns 5 - the preincrement evaluates properly, and it goes into true condition
        System.out.println(y2); // 9;
        System.out.println(z2); // 6 - because post decrement, is assigned the x2 which is 6 before x is decreased by 1 again;

    }
}

// 0000 0011
// 1111 1100
// 0000 0110
// it will be 0000 0100;
// 0000 0011
// 1111 1001
// it will be 0000 0001;
// OR it will be 0000 0101; which is binary representation of 5;



