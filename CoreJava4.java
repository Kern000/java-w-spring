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

        // skipping else if
        // ternary operator next

        int n = 5;
        int result = 0;
        result = n % 2 == 0 ? 10 : 20; 
        System.out.println(result);
    
        // it will check n vs the case;
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Enter a valid number");
        } // if never break, if n == 2, it will print Sun because for switch once hit a positive case, it will run the rest of cases

    }


}
