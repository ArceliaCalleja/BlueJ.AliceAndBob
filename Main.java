import java.util.Scanner;
/** 
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("type your name");
        String name = scan.next();
       
        if (name.equals("Alice") || name.equals("Bob")){
            System.out.println("Hello"+ name);
        }
        
        
        


    }
}
