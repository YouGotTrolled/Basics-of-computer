import java.util.Scanner;
public class t13{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scan.nextInt();
        int sum;
        int k=0;
        int l=0;
        for(int i=0;i<n;i++){
            System.out.println("enter the number:");
            int x=scan.nextInt();
            if(x!=1){
                sum=1;
                for(int j=2;j<=x/2;j++){
                    if(x%j==0){
                        sum+=j;
                    }
                }
                if(x==sum){
                    System.out.println("کامل هست");
                    k++;
                }
                else if(sum==1){
                    System.out.println("اول هست");
                    l++;
                }
            }
        }
        System.out.println("تعداد کامل="+k);
        System.out.print("تعداد اول="+l);
    }
}