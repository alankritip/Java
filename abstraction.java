public class abstraction{
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.legs();
        Mustang m = new Mustang();// calls all constructors hierachially
    }
}
abstract class Animal{
    Animal(){
        System.out.println("ANIMAL CONSTRUCTOR IS CALLED");
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void legs();
}
class Horse extends Animal{
    Horse(){
        System.out.println("HORSE CONSTRUCTOR IS CALLED");
    }
    void legs(){
        System.out.println("4 legs");
    }
}
class  Mustang extends Horse{
    Mustang(){
        System.out.println("MUSTANG CONSTRUCTOR IS CALLED");
    }
    void legs(){
        System.out.println("4 LEGS");
    }
}