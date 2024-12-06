import java.util.Scanner;
public class t16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عدد را وارد کنید");
        int x=scan.nextInt();
        if(x%5==0&&x%7==0){
            System.out.println("عدد بر 5و7 بخشپزیر است");
        }
        else{
            System.out.println("عدد بر 5و7 بخشپزیر نیست");
        }
    }
}