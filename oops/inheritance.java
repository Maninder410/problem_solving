

class shape{
    String color;
    //this is called as base class
    public void area(){
        System.out.println("displays area");
    }

}
class Triangle extends shape{
//this is called subclass/child class
    //***inheritance -> single level inheritance->there is one base class and it is inherited
    //by a base class
    //***multilevel inheritance = one class inherits the features from a parent class and the
    //newly created sub-class becomes the base class for another new class
    // ***hierarchical inheritance - there is one parent class it's properties are inherited
    //by multiple it's multiple childs
    //***hybrid inheritance - mixture of single,multilevel,hierarchical
    //***multiple inheritance - not present in java but with the help of interfaces, we can achieve
    //multiple inheritance


    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class EquilateralTraingle extends Triangle{
    public void area(int l, int h){
        System.out.println(l*h*1/2);
    }
    //this is called multilevel inheritance
}
class Traingle1 extends shape{
    public void area(int l, int h){
        System.out.println(l*h*1/2);
    }
}
class circle extends shape{
    public void area(int r){
        System.out.println(3.14*r*r);
        //this is example of hierarchical inheritance
    }
}
public class inheritance {
    public static void main(String[] args) {
        //properties or methods of one class can be used in other classes
        //with inheritance we can achieve reusibility of code
        //
        Triangle t1 = new Triangle();
        t1.color = "red";


    }
}
