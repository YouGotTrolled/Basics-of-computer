import java.util.Scanner;
public class t13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عداد را وارد کنید");
        int x=scan.nextInt();
        int y=scan.nextInt();
        System.out.println("عملگر را وارد کنید");
        char z=scan.next().charAt(0);
        if(z=='+'){
            System.out.println((x+y));
        }
        else if(z=='-'){
            System.out.println((x-y));
        }
        else if(z=='*'){
            System.out.println((x*y));
        }
        else if(z=='/'&&y!=0){
            System.out.println((x/y));
        }
        else{
            System.out.println("error");
        }
    }
}