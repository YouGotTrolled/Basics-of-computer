import java.util.Scanner;
public class MT11{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your number");
        int x = scan.nextInt();
        byte[] A = {0,0,0,0,0,0};
        String[] B = {"A","B","C","D","E","F"};
        int t;
        byte g;
        boolean flag = true;
        for(;x>=1 && flag;x/=16){
            t=x%16;
            if(t>9){
                A[t-10]++;
            }
        }
        for(t=0;t<6;t++){
            g=A[t];
            if(g>0){
                System.out.print(B[t]+".."+A[t]+"  ");
            }
        }

    }
}