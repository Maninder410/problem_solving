import java.util.*;
class student{
    String name;
    int age;
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){//here functions have same name but they have different argument/parameter or return type or number of argument
        //is called funtion overloading
        System.out.println(age);
    }
    public void printinfo(String name,int age){
        System.out.println(name + " "+age);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        //poly - many
        //morphism - many forms
        //two types - function overloading(compile time polymorphism), overriding(run time poly)
        student s1 = new student();
        s1.name = "maninder";
        s1.age = 19;
        s1.printinfo(s1.name,s1.age);
    }
}
