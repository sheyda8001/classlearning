//package classlearning;
//
//import java.util.Scanner;
//
//public class chess {
//    public static void main(String []args) {
//        Scanner s = new Scanner(System.in);
//        int x1, y1, x2, y2;
//
//        game12 g=new game12();
//        g.setBoard();
//        do{do {
//            System.out.println(g.turn() + "'s turn");
//            System.out.println("piece's x:");
//            x1 = s.nextInt();
//            System.out.println("piece's y:");
//            y1 = s.nextInt();
//            System.out.println("to which x?");
//            x2 = s.nextInt();
//            System.out.println("to which y?");
//            y2 = s.nextInt();
//            if(!g.valid()) System.out.print("unvalid enter again");
//        }while(!g.valid());
//            g.board();
//            g.condition();
//        }while(game.stop());
//    }
//}
