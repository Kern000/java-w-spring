public class StringDemo {
    
    public static void main(String a[]){
        String name = new String("hello"); //this is using String constructor
        System.out.println(name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" there"));
        System.out.println(name);

        String name2 = "meow"; //This creates String object

        name = name + "hello2";
        System.out.println(name);

        //Process of combining identical strings is called interning
        //Language compilers does this; //inside Heap - String constant pool; Every String is a string literal, a constant tt cant be changed. -> Can't change the string;
        String s1="Java";
        String s2="Java"; // s1 and s2 will be same object
        System.out.println(s1 == s2); // This compares their memory address;
        // String constant pool have a table - do we have tt string in our pool? No, then they will create the string there "hello" w the key being the memory address -> name local variable be paired the reference memory address to "hello" in the string constant pool
        // In the stack, s2 will simply check String constant pool and use the same memory address of the same string;
        // This saves memory in the heap memory;
        // when concat string, we create new object and giving new memory address
        // The old string that is no longer used after concat - will be eligible for garbage collection to get memory back
        // Strings are generally immutable - once u create the object, u cant change it

        // But if the Strings are compiled separately in diff JAR files, they would not be same object

    }

}
