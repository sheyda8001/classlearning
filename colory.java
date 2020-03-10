package classlearning;

public class colory {
    public String reverse(String color)
    {
        if (color == "BLACK") {
            return "WHITE";
        } else {
            return "BLACK";
        }
    }
    public int direct(String color) {
        if (color == "WHITE") {
            return -1;
        } else {
            return 1;
        }
    }

}
