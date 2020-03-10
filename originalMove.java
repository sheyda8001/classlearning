package classlearning;

public class originalMove  implements move {
    private originalMove(mohre s, int x1, int y1, mohre t,
                       int x2, int y2, mohre r) {
        _selected = s;
        _x1 = x1;
        _y1 = y1;
        _target = t;
        _x2 = x2;
        _y2 = y2;
        _replace = r;
    }
    public originalMove(mohre s, int x1, int y1, mohre t, int x2, int y2) {
        _selected = s;
        _x1 = x1;
        _y1 = y1;
        _target = t;
        _x2 = x2;
        _y2 = y2;
        _replace = null;
    }

    private int _x1;
    private int _y1;
    private int _x2;
    private int _y2;
    private mohre _selected;
    private mohre _target;
    private mohre _replace;
    public mohre replace() {
        return _replace;
    }
    public int x1() {
        return _x1;
    }
    public int y1() {
        return _y1;
    }
    public int x2() {
        return _x2;
    }
    public int y2() {
        return _y2;
    }
    public move moveback() {
        return new originalMove(_selected, _x2, _y2, null, _x1, _y1, _target);
    }
    public mohre target() {
        return _target;
    }
    public mohre selected() {
        return _selected;
    }
    public boolean isSpecial() {
        return false;
    }
}
