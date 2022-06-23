import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int y = in.nextInt();//불기 연도 입력받기
        
        System.out.println(y-543);//서기 연도로 변환하기 위한 값 빼기
        
        in.close();
    }
}