import java.util.Scanner;
public class t12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عداد را وارد کنید");
        int x=scan.nextInt();
        int y=scan.nextInt();
        int z=scan.nextInt();
        int min = x;
        if(min>y){
            min = y;
        }
        if(min>z){
            min = z;
        }
        System.out.println(min);
    }
}