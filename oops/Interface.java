interface animal1{
   public void walk();//here it is only defined
    int eyes = 2;//this will be same for all animals
   //similar to class,
    //we cannot create constructors in interface
}
interface  herbivore{

}
class horses implements animal1,herbivore{//implements is used instead of extends
    //with interfaces, we can achieve multiple inheritance in java

    public void walk(){
        System.out.println("walkas on 4 legs");
    }
}
class std{
    String name;
    static String school;//by writing static we are ensuring that we can use this method
    //any where without even creating an object
}
public class Interface {
    public static void main(String[] args) {
        horses horse1 = new horses();
        horse1.walk();
        std.school = "kv2";
        std std1 = new std();
        std1.name = "tony";
        System.out.println(std1.school);//here we have initialized the name of the

        //school of std without creating it's object
        //common memory is given to static function
    }
}
