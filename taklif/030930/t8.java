import java.util.Scanner;
public class t8{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scan.nextInt();
        int sum;
        int k=0;
        for(int i=0;i<n;i++){
            System.out.println("enter the number:");
            int x=scan.nextInt();
            if(x!=1){
                sum=1;
                for(int j=2;j<x;j++){
                    if(x%j==0){
                        sum+=j;
                    }
                }
                if(x==sum){
                    System.out.println("کامل هست");
                    k++;
                }
            }
        }
        System.out.print("تعداد ="+k);
    }
}