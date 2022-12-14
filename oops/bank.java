class Account{
    public String name;
    protected  String email;//only subclasses of other package can access
    private String password;//can only be accessed inside the class
    public String getPassword(){//getter and setter are used to access private memebers
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
}
//there are four types of access specifiers - public, private, protected and default
public class bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "maninder";
        account1.email = "maninder@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
//        account1.password = "dkfajk";//not possible because password is private
//encapsultaion - data and methods are combined are combined in one unit and this is called encapsulation
        //data hiding is possible using encapsulation
        //abstraction -> showing important things to user and hiding non important things
        //to user
    }
}
