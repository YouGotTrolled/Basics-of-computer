import java.util.Scanner;
public class t2{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number:");
        int x = scan.nextInt();
        int[] A = new int[x];
        boolean flag;
        int k = 0;
        for(int i = 2;i<x;i++){
            flag=true;
            for(int j = 2; j<i/2 && flag;j++){
                if(i%j==0){
                    flag=false;
                }
            }
            if(flag){
                A[k++]=i;
            }
        }
        if(x>2){
            System.out.print("(");
        }
        for(int i=0;i<(k-1);i++){
            System.out.print(A[i]+",");
        }
        if(x>2){
            System.out.print(A[k-1]+")");
        }
    }
}