import java.util.Scanner;
public class t8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عدد را وارد کنید");
        int x=scan.nextInt();
        float pi = 3.14f;
        System.out.println("محیط :" + (x*2*pi));
        System.out.println("مساحت :"+ (x*x*pi));
    }
}