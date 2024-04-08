public class interfac{
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface ChessPlay{
    void moves();
}
class Queen implements ChessPlay{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlay{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}