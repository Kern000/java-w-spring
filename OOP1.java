// object - properties and methods (behaviors);
// IRL - objects needed to function
// JVM creates the object in java but needs a blueprint aka the class;
// so in java file, we design (like iPhone design in CA but manuf in china), then send byte code when compile to JVM which will create the class object and run it within Java runtime env;

class Calculator {

    public int addition(int num1, int num2){
        System.out.println("Calc addition here");
        return num1 + num2;
    }


}

public class OOP1 {

    public static void main(String a[]){
        int num1 = 5;
        int num2 = 10;

        Calculator calculator1 = new Calculator();
        // reference variable;
        int result = calculator1.addition(num1, num2);

        System.out.println(result);

    }
    // everytime u create an object, space is consumed

}

// to compile java code, need JDK;
// inbuilt classes and libraries from from JRE
// JVM is part of JRE
// every module requires a main method (a starting point of the program for this module) - e.g. a module is a steering wheel of a car, many modules come together to form a software (ea module will hv classes, ea with their own characteristic and behv - like car wheel can turn, is what color etc)
// how can we use something without the object right, so create a new instance of the object;

