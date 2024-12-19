import java.util.Scanner;
public class t5_1{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int x=scan.nextInt();
        int[] temp=new int[10];
        int i=0;
        int j;
        if(x>=0){
            while(x>=1){
                temp[i++]=(x%10);
                x/=10;
            }
            for(j=0;j<i;j++){
            System.out.print(temp[j]);
            }
        }
        else{
            System.out.print("error");
        }
    }
}