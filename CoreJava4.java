public class CoreJava4 {
    
    public static void main(String args[]){

        int x = 10;
        if(true) System.out.println("hello");
        if(false) System.out.println("bye");
        if (x>10) System.out.println("yes more than 10");
        if (x>=10 && x<20) System.out.println("equal or more than 10, less than 20");
        if (x<10 && x==10) System.out.println("true"); // this will short circuit

        // if multiple statement, need {}
        int y = 5;
        if (x < y){
            System.out.println("x is smaller than y");
        } else {
            System.out.println("y is smaller");
        }

    }

}
