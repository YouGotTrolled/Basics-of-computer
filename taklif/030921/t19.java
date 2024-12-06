import java.util.Scanner;
public class t19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عدد را وارد کنید");
        int x=scan.nextInt();
        if(x>0){
            System.out.println("عدد مثبت است");
        }
        else if(x<0){
            System.out.println("عدد منفی است");
        }
        else{
            System.out.println("صفر");
        }
    }
}