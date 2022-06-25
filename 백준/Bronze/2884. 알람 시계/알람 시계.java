import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int h = in.nextInt();
        int m = in.nextInt();
        
        if(m < 45){
            if(h == 0){
                h += 23;
            }
            else{
                h -= 1;
            }
            m += 60;
            m -= 45;
        }
        else{
            m -= 45;
        }
        
        System.out.println(h + " " + m);
        in.close();
    }
}