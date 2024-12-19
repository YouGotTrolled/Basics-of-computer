import java.util.Scanner;
public class t5_2{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int x=scan.nextInt();
        if(x<1000000003){
        int t=0;
        while(x>=1){
            t=(t*10)+(x%10);
            x/=10;
        }
        System.out.print(t);
        }
        else{
            System.out.print("error");
        }
    }
}