import java.util.Stack;
import java.util.Scanner;

public class ZerosOnes {
    public static void main(String[] args){
        int m =0,i = 0;
        Scanner sy = new Scanner(System.in);
        String str = sy.nextLine();
        sy.close();
        Stack<Character> scnr = new Stack<>();

        long starttime = System.nanoTime();
        for(i = 0; i< str.length();i++){
            if(m == 0 && str.charAt(i) == '0') {
                scnr.push(str.charAt(i));
            }
            else if( !scnr.isEmpty() && (str.charAt(i)=='1' && scnr.peek() == '0')){
                m = 1;
                scnr.pop();
            }
            else{
                break;
            }
        
        }
        if( scnr.isEmpty() && i == str.length() ){
            System.out.println("Yes");
          }
          else{
           System.out.println("No");
   
          }

          long endtime = System.nanoTime();
          
          long duration =   endtime - starttime;
          System.out.println(duration);
    }
}
