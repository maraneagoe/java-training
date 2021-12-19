package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void add(Pawn pawn, int xCoordinate, int yCoordinate) {
        if (!isLegalBoardPosition(xCoordinate, yCoordinate) || pieces[yCoordinate][xCoordinate] != null) {
            return;
        }

        pieces[yCoordinate][xCoordinate] = pawn;
        pawn.setXCoordinate(xCoordinate);
        pawn.setYCoordinate(yCoordinate);
    }

    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return (0 <= xCoordinate && xCoordinate < MAX_BOARD_WIDTH) && (0 <= yCoordinate && yCoordinate < MAX_BOARD_HEIGHT);
    }
}
