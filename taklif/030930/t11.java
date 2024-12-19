import java.util.Scanner;
public class t11{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scan.nextInt();
        int t=1;
        int k=0;
        int x;
        for(int i=0;i<n;i++){
            System.out.println("enter the number:");
            x=scan.nextInt();
            while((t*t)<x){
                t++;
            }
            if((t*t)==x){
                k++;
            }
        }
        System.out.print("تعداد ="+k);
    }
}