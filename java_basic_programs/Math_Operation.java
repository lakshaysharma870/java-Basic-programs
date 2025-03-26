import java.util.Scanner;

public class Math_Operation{
    static public void main(String arg[]){
         cal c = new cal();
        //  c.sum();
        //  c.divide();
        //  c.mult();
        c.table();
    }
}
class cal{
    cal(){
        System.out.println("start");
    }
    Scanner in = new Scanner(System.in);
    
    void sum(){
     int a,b,c;
     a=in.nextInt();
     b=in.nextInt();
     c=a+b;
     System.out.println("ans :"+c);
    }
    void divide(){
        float a,b,c;
        a=in.nextFloat();
        b=in.nextFloat();
        c=a/b;
        System.out.println("ans :"+c);
    }
    void mult(){
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=a*b;
        System.out.println("ans :"+c);
    }
    void table(){
        System.out.println("eneter no:");
        int n = in.nextInt();
        for(int i=1 ;i<=10;i++){
            System.out.println(n+"*"+i+":"+n*i);
        }
    }
}