public class multiple_inheritance{
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();
        b.eatflesh();
    }
}
interface Herbivore{
    void eat();
}
interface Carnivore{
    void eat();

}
class Bear implements Herbivore,Carnivore{
    public void eat(){
        System.out.println("eats grasses");
    }
    public void eatflesh(){
        System.out.println("EATS FLESH");
    }
 }
