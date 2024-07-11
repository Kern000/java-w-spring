class Mobile{

    String brand;
    int price;
    static String name;

    // static block will only be called once across instances
    static {
        name = "Phone";
        System.out.println("In static block");
    }

    // constructor is called w ea initialization of obj
    public Mobile(String brand, int price){
        this.brand = brand;
        this.price = price;
        // name = "Phone"; This will save the initialization of static variable everytime
        System.out.println("In constructor block");
    }
    // note that constructor doesn't have return type
    // It is specific in using the same name and casing as the Class
    // It purpose isnt to return a value, but to initialize objects

    public void show(){
        System.out.println(brand + ": " + price + ": " + name);
    }

    public static void showStatic(Mobile obj){
        System.out.println(name + ": " + obj.brand + ": " + obj.price);       
    }
}

class ShadowClass {

    static {
        System.out.println("Shadow class loaded. In static block.");
    }

}

public class StaticMethod {
    public static void main(String a[]) throws ClassNotFoundException{

        Mobile obj1 = new Mobile("Samsung", 100);

        Mobile obj2 = new Mobile("Apple", 200);

        Mobile.showStatic(obj1);
        Mobile.showStatic(obj2);

        // Loading Shadow Class;
        // we use the Class called Class to load a class explicitly
        // requires throws class not found exception to handle any exception
        // call the static method forName();
        Class.forName("ShadowClass");

    }
}

// Class loads first
// then objects are instantiated
// Hence static blocks get loaded first;
// JVM special area - class loader
// every time class is loaded, it will call the static block and the methods inside

// But if u dun create the object, it will not load the other class itself and thus the static block there would not run;
