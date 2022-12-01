package games.tictactoe.me;
class Board{
    String[] board = {" "," "," "," "," "," "," "," "," " };

    void printBoard(){
        System.out.println(" " + board[0] +  "|" + " " + board[1] + "|" + " " + board[2] );
        System.out.println("--------");
        System.out.println(" " + board[3] +  "|" + " " + board[4] + "|" + " " + board[5] );
        System.out.println("--------");
        System.out.println(" " + board[6] +  "|" + " " + board[7] + "|" + " " + board[8] );
    }
}
class Player {
    String name;
    Player(String type){

    }
}
public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();
    }
}
