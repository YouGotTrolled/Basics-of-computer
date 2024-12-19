import java.util.Scanner;
public class t3_2{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int x=scan.nextInt();
        int temp=0;
        if(x<1024){
            int i=1;
            while(x>=1){
                temp+=((x%2)*i);
                i*=10;
                x/=2;
            }
            System.out.print(temp);
        }
        else{
            System.out.print("error");
        }
    }
}