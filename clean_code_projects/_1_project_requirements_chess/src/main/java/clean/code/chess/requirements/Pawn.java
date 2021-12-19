package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
        this.xCoordinate = -1;
        this.yCoordinate = -1;
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    private void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void move(MovementType movementType, int newX, int newY) {
        if (movementType == MovementType.MOVE) {
            doMove(newX, newY);
        } else if (movementType == MovementType.CAPTURE) {
            doCapture(newX, newY);
        }
    }

    private void doMove(int newX, int newY) {
        if (newX != xCoordinate) {
            return ;
        }

        if ((pieceColor == PieceColor.BLACK && newY == yCoordinate - 1)
         || (pieceColor == PieceColor.WHITE && newY == yCoordinate + 1)) {
            yCoordinate = newY;
        }
    }

    private void doCapture(int newX, int newY) {
        // TODO
    }


    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }
}
