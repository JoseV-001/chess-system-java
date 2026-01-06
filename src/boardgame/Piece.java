package boardgame;

public class Piece {

  protected Position position;
  private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // Java já deixa null(não precisa colocar)
    }

    protected Board getBoard() {
        return board;
    }

}
