import java.util.Scanner;
public class t1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عداد را وارد کنید");
        int x=scan.nextInt();
        int y=scan.nextInt();
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println(x + " " + y);
    }
}