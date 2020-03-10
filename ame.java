package classlearning;
import java.util.Scanner;
public class ame {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        xo game=new xo();
        int x,y;
       do
        {
            System.out.println("turn="+game.turn());
            System.out.print("enter");
            x=s.nextInt();
            y=s.nextInt();
             game=new xo(x,y);
             game.r();
             game.show();
        } while(game.flag()==true);

game.Winner();

    }
}
