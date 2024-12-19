import java.util.Scanner;
public class t7{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int x=scan.nextInt();
        int a=1;
        int b=1;
        String c="عضو نیست";
        while(a<x){
            a+=b;
            b=a-b;
        }
        if(a==x){
            c="عضو هست";
        }
        System.out.print(c);
    }
}