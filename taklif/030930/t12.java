import java.util.Scanner;
public class t12{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scan.nextInt();
        int k=0;
        int a;
        int b;
        int x;
        for(int i=0;i<n;i++){
            System.out.println("enter the number:");
            x=scan.nextInt();
            a=1;
            b=1;
            while(a<x){
                a+=b;
                b=a-b;
            }
            if(a==x){
                k++;
            }
        }
        System.out.print("تعداد ="+k);
    }
}