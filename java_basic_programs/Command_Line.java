
/*************   basic *********** */
// public class Command_Line {
//     static public void main(String[] arg){
//         System.out.println(arg[0]);
//         System.out.println(arg[1]);
//         System.out.println(arg[2]);

//     }
// }

/*************   addintion whose last digit is 7 *********** */

public class Command_Line {
    static public void main(String...arg){
        int a=0 ,c;
       
        for(int i=0;i<arg.length;i++){
            
            System.out.println(arg[i]);
            c = Integer.parseInt(arg[i]);
            if(c%10==7){
                a=a + c ;
            }
        }
        System.out.println("the sum of values is :"+a);

    }
}
