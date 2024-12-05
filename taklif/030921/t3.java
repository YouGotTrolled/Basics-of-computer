import java.util.Scanner;
public class t3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عداد را وارد کنید");
        int x=scan.nextInt();
        int y=scan.nextInt();
        int z=scan.nextInt();
        int temp;
        temp = x;
        x = y;
        y = z;
        z = temp;
        System.out.println(x + " " + y + " " + z);
    }
}