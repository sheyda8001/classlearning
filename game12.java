//package classlearning;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class game12 {
//    private colory turn;
//    public static int round=0;
//    static mohre [][]B=new mohre [8][8];
//    static String [][]A= new String[8][8];
//    private List<move> moves;
//    game12()
//{
//    moves =new ArrayList<move>();
//}
//    public void moveback() {
//        if (moves.size() > 0) {
//            move lastMove = moves.remove(moves.size() - 1);
//           moveplz(lastMove.moveback());
//            moves.remove(moves.size() - 1);
//        }
//    }
//public void setBoard()
//{
//    mohre blackRo0 = new Rook("BLACK", this, 0, 0);
//    mohre blackKn0 = new Knight("BLACK", this, 1, 0);
//    mohre blackBi0 = new Bishop("BLACK", this, 2, 0);
//    mohre blackQu0 = new Queen("BLACK", this, 3, 0);
//    _blackKi = new King("BLACK", this, 4, 0);
//    mohre blackBi1 = new Bishop("BLACK", this, 5, 0);
//    mohre blackKn1 = new Knight(BLACK, this, 6, 0);
//    mohre blackRo1 = new Rook(BLACK, this, 7, 0);
//    mohre blackPa0 = new Pawn(BLACK, this, 0, 1);
//    mohre blackPa1 = new Pawn(BLACK, this, 1, 1);
//    mohre blackPa2 = new Pawn(BLACK, this, 2, 1);
//    mohre blackPa3 = new Pawn(BLACK, this, 3, 1);
//    mohre blackPa4 = new Pawn(BLACK, this, 4, 1);
//    mohre blackPa5 = new Pawn(BLACK, this, 5, 1);
//    mohre blackPa6 = new Pawn(BLACK, this, 6, 1);
//    mohre blackPa7 = new Pawn(BLACK, this, 7, 1);
//    mohre whiteRo0 = new Rook(WHITE, this, 0, 7);
//    mohre whiteKn0 = new Knight(WHITE, this, 1, 7);
//    mohre whiteBi0 = new Bishop(WHITE, this, 2, 7);
//    mohre whiteQu0 = new Queen(WHITE, this, 3, 7);
//    _whiteKi = new King(WHITE, this, 4, 7);
//    mohre whiteBi1 = new Bishop(WHITE, this, 5, 7);
//    mohre whiteKn1 = new Knight(WHITE, this, 6, 7);
//    mohre whiteRo1 = new Rook(WHITE, this, 7, 7);
//    mohre whitePa0 = new Pawn(WHITE, this, 0, 6);
//    mohre whitePa1 = new Pawn(WHITE, this, 1, 6);
//    mohre whitePa2 = new Pawn(WHITE, this, 2, 6);
//    mohre whitePa3 = new Pawn(WHITE, this, 3, 6);
//    mohre whitePa4 = new Pawn(WHITE, this, 4, 6);
//    mohre whitePa5 = new Pawn(WHITE, this, 5, 6);
//    mohre whitePa6 = new Pawn(WHITE, this, 6, 6);
//    mohre whitePa7 = new Pawn(WHITE, this, 7, 6);
//    mohre[][] newBoard = {
//            {blackRo0, blackPa0, null, null, null, null, whitePa0, whiteRo0},
//            {blackKn0, blackPa1, null, null, null, null, whitePa1, whiteKn0},
//            {blackBi0, blackPa2, null, null, null, null, whitePa2, whiteBi0},
//            {blackQu0, blackPa3, null, null, null, null, whitePa3, whiteQu0},
//            {_blackKi, blackPa4, null, null, null, null, whitePa4, _whiteKi},
//            {blackBi1, blackPa5, null, null, null, null, whitePa5, whiteBi1},
//            {blackKn1, blackPa6, null, null, null, null, whitePa6, whiteKn1},
//            {blackRo1, blackPa7, null, null, null, null, whitePa7, whiteRo1} };
//    A[0][0]="wr";
//    A[0][7]="wr";
//    A[0][1]="wn";
//    A[0][6]="wn";
//    A[0][2]="wb";
//    A[0][5]="wb";
//    A[0][3]="wq";
//    A[0][4]="wk";
//    A[7][0]="br";
//    A[7][7]="br";
//    A[7][1]="bn";
//    A[7][6]="bn";
//    A[7][2]="bb";
//    A[7][5]="bb";
//    A[7][3]="bq";
//    A[7][4]="bk";
//    A[1][0]="wp";
//    A[1][7]="wp";
//    A[1][1]="wp";
//    A[1][6]="wp";
//    A[1][2]="wp";
//    A[1][5]="wp";
//    A[1][3]="wp";
//    A[1][4]="wp";
//    A[6][0]="bp";
//    A[6][7]="bp";
//    A[6][1]="bp";
//    A[6][6]="bp";
//    A[6][2]="bp";
//    A[6][5]="bp";
//    A[6][3]="bp";
//    A[6][4]="bp";
//    for(int i=2;i<=5;i++)
//    {
//        for(int j=0;j<8;j++) A[i][j]="ee";
//    }
//}
//
//
//    public void board()
//    {
//        round++;
//        System.out.println("*****************************************");
//        for(int i=0;i<8;i++)
//        {System.out.print("*");
//            for(int j=0;j<8;j++)
//            {
//                System.out.print(" "+A[i][j]+" *");
//            }
//
//            System.out.println("\n*****************************************");
//        }
//    }
//    mohre get(int i, int j)
//    {
//        return B[i][j];
//    }
//public void moveplz(move move1)
//{
//moves.add(move1);
//    if (!move1.isSpecial()) {
//        originalMove originalMove = (originalMove) move1;
//        possiblemove(originalMove);
//    } else {
//        specialMove doublemove = (specialMove) move1;
//        possiblemove(doublemove.move11());
//        possiblemove(doublemove.move22());
//    }
//    turn = turn.reverse();
//}
//    private void possiblemove(originalMove move1) {
//        B[move1.x1()][move1.y1()] = move1.replace();
//        if (move1.replace() != null) {
//            move1.replace().locate(move1.x1(), move1.y1());
//        }
//        B[move1.x2()][move1.y2()] = move1.selected();
//        if (move1.selected() != null) {
//            move1.selected().locate(move1.x2(), move1.y2());
//        }
//        if (move1.target() != null) {
//            move1.target().locate(-1, -1);
//        }
//    }
//    public boolean ischecked(String color) {
//        colory c=new colory();
//        int x = kingx(color);
//        int y = kingy(color);
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                mohre p = get(i, j);
//                if (p != null && p.paint() == c.reverse(color)
//                        && p.can(x, y)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//    public int kingy(String color) {
//        if (color == "WHITE") {
//            return _whiteKi.getY();
//        } else {
//            return _blackKi.getY();
//        }
//    }
//    public int kingx(String color) {
//        if (color == "WHITE") {
//            return _whiteKi.getX();
//        } else {
//            return _blackKi.getX();
//        }
//    }
//    public void setSelectedX(int x) {
//        _selectedX = x;
//    }
//    private int _selectedX;
//    private int _selectedY;
//    public void setSelectedY(int y) {
//        _selectedY = y;
//    }public int selectedY() {
//        return _selectedY;
//    }public int selectedX() {
//        return _selectedX;
//    }
//    private King _blackKi;
//    private King _whiteKi;
//
//}
