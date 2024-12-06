import java.util.Scanner;
public class t14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عدد را وارد کنید");
        int x=scan.nextInt();
        if(x<0){
            x=-x;
        }
        System.out.println(x);
    }
}