import java.util.Scanner;
public class t4{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int x=scan.nextInt();
        int f=1;
        int i=2;
        while(f<x){
            f*=(i++);
        }
        if(f==x){
            System.out.print("your number="+(--i)+"!");
        }
        else{
            System.out.print("...");
        }
        
    }
}