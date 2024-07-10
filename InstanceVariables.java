
class Student{
    int rollno;
    String name;
    int marks;
}

public class InstanceVariables {

    public static void main(String a[]){
        
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "mark";
        s1.marks = 99;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "martha";
        s2.marks = 98;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "meow";
        s3.marks = 97;

        Student[] studentArray1 = new Student[3];
        studentArray1[0] = s1;
        studentArray1[1] = s2;
        studentArray1[2] = s3;

        for(int i=0; i<studentArray1.length; i++){
            System.out.println("rollno: " + studentArray1[i].rollno);
            System.out.println("name: " + studentArray1[i].name);
            System.out.println("marks: " + studentArray1[i].marks);
            System.out.println();
        }

        for(Student student : studentArray1){
            System.out.println("rollno: " + student.rollno);
            System.out.println("name: " + student.name);
            System.out.println("marks: " + student.marks);
            System.out.println();
        }
    }

}
