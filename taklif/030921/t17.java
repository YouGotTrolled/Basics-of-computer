import java.util.Scanner;
public class t17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("عداد را وارد کنید");
        System.out.println("a(x^2)+bx+c");
        System.out.println("a?");
        int a=scan.nextInt();
        System.out.println("b?");
        int b=scan.nextInt();
        System.out.println("b?");
        int c=scan.nextInt();
        double d= (Math.pow(b,2))-(4*a*b);
        float x1;
        float x2;
        if(d>0){
            float d2=((int)((Math.sqrt(d))*100))/100;
            x1=(-b+d2)/(2*a);
            x2=(-b-d2)/(2*a);
            System.out.println(x1+" "+x2);
        }
        else if(d==0){
            x1=(-b)/(2*a);
            System.out.println(x1);
        }
        else{
            System.out.println("دلتا منفی است");
        }
    }
}