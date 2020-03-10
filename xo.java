package classlearning;
import java.util.ArrayList;
public  class xo {
    int xais,yais;
   static String board="";
    boolean win1=false;
    char winner;
   static ArrayList <Integer> A=new ArrayList<Integer>();
    static ArrayList <Integer> B=new ArrayList<Integer>();
    static char[][]D=new char[3][3];
    public void array()
    {
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                D[i][j]='q';
            }
        }
    }



    private static short n=-1;
    public  xo(int x,int y){
        if(n==-1)
        {array();}
        xais=x;
        A.add(xais);
        yais=y;
        B.add(yais);
        n++;
        if(n%2==0)
        {  try {
            D[xais][yais] = 'o';
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("again");
            n--;
        }
        }
        else{
            try{
            D[xais][yais]='x';}
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("again");
                n--;
            }
        }
    }

    public xo() {

    }

    public boolean flag(){
        boolean f=true,win=true;
        for(int i=0;i<n;i++)
        {
            if((xais==A.get(i))&&(yais==B.get(i)))
                f=false;
        }
       for(int i=0;i<=2;i++)
       {
           if(D[i][0]!='q'&&D[i][0]==D[i][1]&&D[i][0]==D[i][2])
           {
               win=false;
               win1=true;
               winner=D[i][0];
               break;
           }
           if(D[0][i]!='q'&&D[0][i]==D[1][i]&&D[0][i]==D[2][i])
           {
               win=false;
               win1=true;
               winner=D[0][i];
               break;
           }
           if(D[0][0]!='q'&&D[0][0]==D[1][1]&&D[0][0]==D[2][2])
           {
               win=false;
               win1=true;
               winner=D[0][i];
               break;
           }
           if(D[0][2]!='q'&&D[0][2]==D[1][1]&&D[0][2]==D[2][0])
           {
               win=false;
               win1=true;
               winner=D[0][i];
               break;
           }
       }
        return (n<9&&f&&win);
    }
    public char turn(){

        if(n%2==0){
            return 'x';}
    else{
        return 'o';
    }
    }
    public void show()
    {
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                if(D[i][j]=='q')
                    System.out.print("  ");
                else
                    System.out.print(D[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void r(){
        System.out.println(xais+","+yais);
    }
    public void Winner(){
        if(win1==true)
        {
            System.out.println("the winner is "+winner);
        }
        else{
            System.out.println("there is no winner");
        }
    }

}
