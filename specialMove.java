package classlearning;

public class specialMove implements move {
    private originalMove _move1;
    private originalMove _move2;

    public move moveback() {
        return new specialMove  ((originalMove) _move2.moveback(), (originalMove) _move1.moveback());
    }
  public  boolean isSpecial()
{
    return true;
}
    public specialMove(originalMove move1, originalMove move2) {
        _move1 = move1;
        _move2 = move2;
    }


    public originalMove move11() {
        return _move1;
    }

    public originalMove move22() {
        return _move2;
    }
}
