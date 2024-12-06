import java.util.Scanner;
public class t6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عدد را وارد کنید");
        int x=scan.nextInt();
        int y=scan.nextInt();
        int z=scan.nextInt();
        System.out.println((x + y + z));
        System.out.println(((x + y + z)/3));
    }
}