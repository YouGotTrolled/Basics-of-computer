import java.util.Scanner;
public class t4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عداد را وارد کنید");
        int x=scan.nextInt();
        int y=scan.nextInt();
        int z=scan.nextInt();
        x+=y+z;
        y=x-y-z;
        z=x-y-z;
        x-=y+z;
        System.out.println(x + " " + y + " " + z);
    }
}