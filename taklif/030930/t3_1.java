import java.util.Scanner;
public class t3_1{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int x=scan.nextInt();
        int[] temp=new int[31];
        int i=0;
        if(x>=0){
            while(x>=1){
                temp[i++]=(x%2);
                x/=2;
            }
            while(i>0){
            System.out.print(temp[--i]);
            }
        }
        else{
            System.out.print("error");
        }
    }
}