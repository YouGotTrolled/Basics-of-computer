import java.util.Scanner;
public class t11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عداد را وارد کنید");
        int x=scan.nextInt();
        int y=scan.nextInt();
        int max = x;
        if(y>x){
            max=y;
        }
        System.out.println(max);
    }
}