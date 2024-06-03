public class Interface {
    public static void main(String[] args){
        Queen q=new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down, left, right, daigonal in all 4 dirns");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class King  implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right in all 2");
    }
}