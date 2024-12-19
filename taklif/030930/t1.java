import java.util.Scanner;
public class t1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number:");
        int x = scan.nextInt();
        int[] a=new int[x];
        int j=0;
        int k=0;
        a[0]=-1;
        int i;
        int temp = x;
        for(i=2;i<=(temp/2);){
            if(x%i == 0){
                if(i!=a[j] && a[0]!=-1){
                    a[j+1]=k;
                    k=1;
                    j+=2;
                    a[j]=i;
                    x/=i;
                }
                else if(i==a[j]){
                    k++;
                    x/=i;
                }
                else{
                    a[j]=i;
                }
            }
            else{
                i++;
            }
        }
        if(a[0]==-1){
            System.out.print(temp+"=("+temp+"^1)");
        }
        else{
            a[j+1]=k;
            System.out.print(temp+"=");
            for(i=0;i<=j;i+=2){
                System.out.print("("+a[i]+"^"+a[i+1]+")");
            }
        }
    }
}