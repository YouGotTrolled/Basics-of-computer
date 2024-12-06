import java.util.Scanner;
public class t18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عداد را وارد کنید");
        int x=scan.nextInt();
        int y=scan.nextInt();
        int z=scan.nextInt();
        int min=x;
        int max=x;
        if(y>max){
            max=y;
        }
        else{
            min=y;
        }
        if(z>max){
            max=z;
        }
        else if(z<min){
            min=z;
        }
        System.out.println("max:"+max+" min:"+min);
    }
}