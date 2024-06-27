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

    }


}
