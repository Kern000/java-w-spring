class AnonymousObject {
    
    public AnonymousObject(){
        System.out.println("Object created by constr");
    }

    public void show(){
        System.out.println("In a show");
    }

}

public class Demo {

    public static void main(String a[]){

        new AnonymousObject(); //anonymous object, nt assign to variable
        // cant reuse;

        new AnonymousObject().show();
    }

}
