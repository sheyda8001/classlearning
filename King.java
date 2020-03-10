//package classlearning;
//
//public class King implements mohre {
//    private game12 game;
//    private colory color;
//    private int x;
//    private int y;
//    private boolean history;
//    public King(colory color, game12 game, int x, int y) {
//        this.color = color;
//        this.game = game;
//        this.x= x;
//        this.y = y;
//        history = false;
//    }
//    public String imageString() {
//        return this.color.abbrev() + KING.abbrev();
//    }
//    public colory color() {
//        return this.color;
//    }
//    public what type() {
//        return KING;
//    }
//    public boolean makeValidMove(int a, int b) {
//        if (Math.abs(a - x) <= 1 && Math.abs(b - this.y) <= 1
//                && (this.game.get(a, b) == null || this.game.get(a, b).color() !=this.color)) {
//            Move move = new SingleMove(this, _x, _y, _game.get(a, b), a, b);
//            return makeMoveCareful(move);
//        } else if (_x == originalX() && _y == originalY()
//                && a == originalX() + 2 && b == originalY()
//                && _game.get(a - 1, b) == null && _game.get(a, b) == null
//                && _game.get(a + 1, b) != null && _game.get(a + 1, b).type() == ROOK
//                && _game.get(a + 1, b).color() == _color && !_game.inCheck(_color)
//                && !_game.guarded(a - 1, b) && !_game.guarded(a, b)
//                && !_moved && !((Rook) _game.get(a + 1, b)).moved()) {
//            SingleMove move1 = new SingleMove(this, _x, _y,
//                    _game.get(a, b), a, b);
//            SingleMove move2 = new SingleMove(_game.get(a + 1, b),
//                    a + 1, b, null, a - 1, b);
//            DoubleMove move = new DoubleMove(move1, move2);
//            return makeMoveCareful(move);
//        } else if (_x == originalX() && _y == originalY()
//                && a == originalX() - 2 && b == originalY()
//                && _game.get(a - 1, b) == null && _game.get(a, b) == null
//                && _game.get(a + 1, b) == null && _game.get(a - 2, b) != null
//                && _game.get(a - 2, b).type() == ROOK
//                && _game.get(a - 2, b).color() == _color
//                && !_game.inCheck(_color)
//                && !_game.guarded(a - 1, b) && !_game.guarded(a, b)
//                && !_moved && !((Rook) _game.get(a - 2, b)).moved()) {
//            SingleMove move1 = new SingleMove(this, _x, _y,
//                    _game.get(a, b), a, b);
//            SingleMove move2 = new SingleMove(_game.get(a - 2, b), a - 2,
//                    b, null, a + 1, b);
//            DoubleMove move = new DoubleMove(move1, move2);
//            return makeMoveCareful(move);
//        } else {
//            return false;
//        }
//    }
//    public void setLocation(int x, int y) {
//        _x = x;
//        _y = y;
//    }
//    public boolean hasMove() {
//        for (int i = -1; i < 2; i++) {
//            for (int j = -1; j < 2; j++) {
//                if (_x + i >= 0 && _x + i <= 7 && _y + j >= 0 && _y + j <= 7) {
//                    if (makeValidMove(_x + i, _y + j)) {
//                        _game.undoMove();
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
//    public boolean canCapture(int a, int b) {
//        return Math.abs(a - _x) <= 1 && Math.abs(b - _y) <= 1;
//    }
//    private boolean makeMoveCareful(Move move) {
//        _game.makeMove(move);
//        if (_game.inCheck(_game.turn().opposite())) {
//            _game.undoMove();
//            return false;
//        } else {
//            _moved = true;
//            return true;
//        }
//    }
//    public int getX() {
//        return _x;
//    }
//    public int getY() {
//        return _y;
//    }
//    private int originalX() {
//        return 4;
//    }
//    private int originalY() {
//        if (_color == PieceColor.WHITE) {
//            return 7;
//        } else {
//            return 0;
//        }
//    }
//
//}
