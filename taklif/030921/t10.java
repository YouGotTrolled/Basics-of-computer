import java.util.Scanner;
public class t10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عدد را وارد کنید");
        int x=scan.nextInt();
        if(x%2==0){
            System.out.println("زوج");
        }
        else{
            System.out.println("فرد");
        }
    }
}