import java.util.Scanner;
public class t7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عداد را وارد کنید");
        int x=scan.nextInt();
        int y=scan.nextInt();
        System.out.println("محیط :" + ((x+y)*2));
        System.out.println("مساحت :"+ (x*y));
    }
}