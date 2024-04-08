public class inheritance{
    public static void main(String[] args) {
        Fish op = new Fish();
        op.eats();
        op.breathe();
        op.swims();
        int i = op.sees(5550);
        System.out.println("it sees "+i);
    }
} // IT IS AN EXAMPLE OF SINGEL LEVEL INHERITANCE
public class Animal{
    void eats(){
        System.out.println("IT EATS");
    }
    void breathe(){
        System.out.println("IT BREATHES");
    }
    int sees(int se){
        return se;
    }
}
class Fish extends Animal{//extends keyword makes the properties of animal class common to Fish subclass
    void swims(){
        System.out.println("IT SWIMS");
    }
}