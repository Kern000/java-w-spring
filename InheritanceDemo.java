public class InheritanceDemo {
    
    public static void main (String a[]){
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4,5);
        int r2 = obj.multi(4,5);
        int r3 = obj.div(5,6);
        int r4 = obj.subtract(10, 5);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }

}

// For inheritance, u need a class file, not a java file - even if delete the java file of tt class, it will work;

