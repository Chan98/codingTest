import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());
        int[] digits = Stream.of(String.valueOf(b).split("")).mapToInt(Integer::parseInt).toArray();
        
        for(int i=digits.length-1; i>=0; i--){
            System.out.println(a * digits[i]);
        }
        System.out.println(a * b);
        
        in.close();
    }
}