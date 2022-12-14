
abstract class Animal{
            abstract void walk();
//here this class is irrelevent
        //abstract means concept that just exist but we cannot use
        //here animal is just a concept

}
class Horse extends Animal{
    public void walk(){
        System.out.println("works on four legs");
    }
}
class chicken extends  Animal{
    public void walk(){
        System.out.println("walks on two legs");
    }
}
public class abstraction {
    public static void main(String[] args) {
Horse horse = new Horse();
horse.walk();
//we cannot create an object of animal because it is an abstract class
        //abstract classes can have constructors
      //  Animal animal = new Animal();
    }

}
