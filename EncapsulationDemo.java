
// encapsulation - keeping it contained and only accessible by what is allowed
// if someone asking for private details, no one shld be able to get those data;
// and u decide if you want to share or not

// private only accessible in same class

class Human {
    
    private int age;
    private String name;
    // if no constructor, will provide default value of 0 for int, null for obj.

    public Human(){
        age = 0;
        name = null;
    }

    public Human(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("Human constructor called");
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
}

public class EncapsulationDemo {
    public static void main(String a[]){
        Human human1 = new Human(11, "Lala");
        System.out.println(human1.getAge());
        System.out.println(human1.getName());

        Human human2 = new Human();
        human2.setAge(30);
        human2.setName("monster");
        System.out.println(human2.getAge());
        System.out.println(human2.getName());

    }
}
