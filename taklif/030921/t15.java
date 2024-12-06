import java.util.Scanner;
public class t15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عدد را وارد کنید");
        int x=scan.nextInt();
        if(x%2==0&&x%3==0){
            System.out.println("عدد بر 2و3 بخشپزیر است");
        }
        else if(x%2==0 || x%3==0){
            System.out.println("عدد بر 2یا3 بخشپزیر است");
        }
        else{
            System.out.println("عدد بر 2و3 بخشپزیر نیست");
        }
    }
}