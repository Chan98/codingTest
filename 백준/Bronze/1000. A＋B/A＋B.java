import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //입력한다.
        //Scanner는 기본적으로 공백을 기준으로 값을 구분하여 입력받는다.
        //Scanner의 디폴트 구분자는 space이다.
        int a = in.nextInt();
        int b = in.nextInt();
        
        System.out.println(a+b);
        in.close();//닫아줌
    }
}