// operators - similar to js
public class CoreJava3 {

    public static void main(String args[]){
    int num1 = 7;
    num1 = num1 + 2;
    num1 += 2;

    int num2 = 5;
    num2 ++; // post increment;
    ++ num2; // pre increment;
    
    int result = num1 % num2;
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(result);

    int num3 = 7;  
    
    int result1 = num3++;
    System.out.println(result1); // this prints 7; instead of 8;

    result1 = ++num3;
    System.out.println(result1); // this prints 9; The prior num3++ now taken effect;
    // ++num and num++ behave differently when trying to fetch the value;
    // ++num is first increment then fetch the value; num++ is fetch the value then increment;
    }
}






