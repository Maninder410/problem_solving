class pen{
    String color;
    String type;//ballpoint,gel
    public void write(){//this is called method
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
        //this-> which objects called the function
    }


}
class Student{
    String name;
    int age;
    public void printName(){
        System.out.println(this.name);
    }
    public void printAge(){
        System.out.println(this.age);
    }
    Student(){//non-parameterized constructor
       // System.out.println("constructor called");
        //this is compulsory to call when we create copy construcor
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

}
public class OOps {


    public static void main(String[] args) {
//        pen pen1 = new pen();//object created
//        pen1.color = "blue";
//        pen1.type = "gel";
//        pen1.write();
//        pen pen2 = new pen();
//        pen2.color = "pink";
//        System.out.println(pen1.color);
//        System.out.println(pen2.color);
    Student s1 = new Student();//student() is a type of constructor
        //constructors => non-parameterized constructor
        //no return type of constructor
        //one object can call one constructor  at a time

    s1.name = "mani";
    s1.age = 20;

   // Student s2 = new Student("anuj",20);parameterized constructor called
        Student s2 = new Student(s1);//copy constructor
        s2.printAge();
        s2.printName();
        Student s3 = new Student();
        s3.name= "sample";
        s3.age = 23;
        s3.printAge();
        s3.printName();
        //there is no destructor in java,instead of it there is garbage collector which automatically deletes
    }//the memory which is not in use
}
