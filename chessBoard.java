public class chessBoard {

    public int[] nbPieces;
    public int nbTurns = 0;

    public chessBoard() {
    }

    public chessBoard(int[] nbPieces, int nbTurns) {
        this.nbPieces = nbPieces;
        this.nbTurns = nbTurns;
    }

    public int[] getNbPieces() {
        return this.nbPieces;
    }

    public void setNbPieces(int[] nbPieces) {
        this.nbPieces = nbPieces;
    }

    public int getNbTurns() {
        return this.nbTurns;
    }

    public void setNbTurns(int nbTurns) {
        this.nbTurns = nbTurns;
    }

    public void createBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("|________");
                if (j == 7) {
                    System.out.println("\n");
                }
            }

        }
    }

}
