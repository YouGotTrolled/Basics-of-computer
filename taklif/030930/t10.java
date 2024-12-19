import java.util.Scanner;
public class t10{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scan.nextInt();
        System.out.println("enter the number:");
        int m=scan.nextInt();
        int temp;
        int a=1;
        int b=1;
        if(n>m){
            temp=n;
            n=m;
            m=temp;
        }
        while(a<m){
            if(a>n){
                System.out.print(" "+a+" ");
            }
            a+=b;
            b=a-b;
        }
    }
}