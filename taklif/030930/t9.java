import java.util.Scanner;
public class t9{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scan.nextInt();
        int sum;
        int i;
        for(i=2;i<n;i++){
            sum=1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(i==6){
                System.out.print("(6");
            }
            else if(i==sum){
                System.out.print(","+i);
            }
        }
        if(i>6)
            System.out.print(")");
    }
}