import java.util.Scanner;
public class t6{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int x=scan.nextInt();
        int t=0;
        int i=1;
        if(x>=0){
            while(x>=1){
                if(!(x%10==0)){
                    t+=(x%10)*(i);
                    i*=10;
                }
                x/=10;
            }
            System.out.print(t);
        }
        else{
            System.out.print("error");
        }
    }
}