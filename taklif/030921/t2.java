import java.util.Scanner;
public class t2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عداد را وارد کنید");
        int x=scan.nextInt();
        int y=scan.nextInt();
        x+=y;
        y=x-y;
        x-=y;
        System.out.println(x + " " + y);
    }
}