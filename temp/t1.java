import java.util.Scanner;
public class t1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("plese enter length:");
        int x=scan.nextInt();
        String[] fn=new String[x];
        String[] n=new String[x];
        int[] ID=new int[x];
        double av=new double[x];
        String temp=scan.nextLine();
        for(int i=0;i<x;i++){
            System.out.println("please enter name in english");
            String name=scan.nextLine();
            n[i]=name;
            System.out.println("please enter family name in english");
            String fname=scan.nextLine();
            fn[i]=fname;
            System.out.println("please enter id");
            int IDt=scan.nextInt();
            ID[i]=IDt;
            System.out.println("please enter avrege");
            double ave=scan.nextDouble();
            av[i]=ave;
        }
        for(int i=0;i<x;i++){
            for(int j=i+1;j<x;j++){
                int m=fn[i].compareTo(fn[j]);
                if(m>0){
                    temp=fn[j];
                    fn[j]=fn[i];
                    fn[i]=temp;
                    temp=n[j];
                    n[j]=n[i];
                    n[i]=temp;
                }
                else if(m==0){
                    int mm=fn[i].compareTo(fn[j]);
                    if(mm>0){
                        temp=fn[j];
                        fn[j]=fn[i];
                        fn[i]=temp;
                        temp=n[j];
                        n[j]=n[i];
                        n[i]=temp;
                    }
                }
            }
        }
        for(int i=0;i<x;i++){
            System.out.println("[Name:"+fn[i]+" "+n[i]+"]");

        }
    }
}