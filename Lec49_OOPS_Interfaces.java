public class Lec49_OOPS_Interfaces {
    public static void main(String[] args){

        Queen q = new Queen();
        q.moves();
    }
}

interface Herbivore {

}

interface Carnivore {

}

class Bear implements Herbivore, Carnivore {

}

interface ChessPlayer {

    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right, Diagonal (in all 4 Direction)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right, Diagonal - (by 1 Step)");
    }
}
