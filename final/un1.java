import java.util.Scanner;
public class un1{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("tedad?");
        int n=scan.nextInt();
        String[] name=new String[n];
        int[] code=new int[n];
        int[] quantity=new int[n];
        int[] price=new int[n];
        int[] darkhars=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("name?");
            scan.nextLine();
            name[i]=scan.nextLine();
            System.out.println("code?");
            code[i]=scan.nextInt();
            System.out.println("quantity?");
            quantity[i]=scan.nextInt();
            System.out.println("price?");
            price[i]=scan.nextInt();
            System.out.println("darkhars?");
            darkhars[i]=scan.nextInt();
        }
        first(name,code,quantity,price,darkhars);
        for(int i=0;i<n;i++){
            System.out.println(name[i]);
        }
        second(name,price);
        third(name,darkhars,quantity);
    }
    public static void first(String[] a,int[] b,int[] c,int[] d,int[] e){
        String temp;
        int tem;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i].compareTo(a[j])>0){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    tem=b[i];
                    b[i]=b[j];
                    b[j]=tem;
                    tem=c[i];
                    c[i]=c[j];
                    c[j]=tem;
                    tem=d[i];
                    d[i]=d[j];
                    d[j]=tem;
                    tem=e[i];
                    e[i]=e[j];
                    e[j]=tem;
                }
            }
        }
    }
    public static void second(String[] a,int[] b){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=b[i];
        }
        float ave=sum/a.length;
        for(int i=0;i<a.length;i++){
            if(b[i]>ave){
                System.out.println(a[i]);
            }
        }
    }
    public static void third(String[] a,int[] b,int[] c){
        for(int i=0;i<a.length;i++){
            if(b[i]>c[i]){
                System.out.println(a[i]);
            }
        }
    }
}