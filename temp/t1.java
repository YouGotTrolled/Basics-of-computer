import java.util.Scanner;
public class t1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("plese enter length:");
        int x=scan.nextInt();
        String[] fn=new String[x];
        String[] n=new String[x];
        int[] ID=new int[x];
        double[] av=new double[x];
        String temp;
        int tem=-1;
        int tem1=-1;
        double te;
        int i=0;
        int j=0;
        int k=0;
        for(;i<x;i++){
            if(i==0){
                System.out.println("----------------\nFirst student--->");    
            }
            else if(i==1){
                System.out.println("Second student--->");
            }
            else if(i==2){
                System.out.println("3rd student--->");
            }
            else{
                System.out.println((i+1)+"th student--->");
            }
            temp=scan.nextLine();
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
            System.out.println("----------------");
        }
        for(i=0;i<x;i++){
            for(j=i+1;j<x;j++){
                int m=fn[i].compareTo(fn[j]);
                if(m>0){
                    temp=fn[j];
                    fn[j]=fn[i];
                    fn[i]=temp;
                    temp=n[j];
                    n[j]=n[i];
                    n[i]=temp;
                    tem=ID[j];
                    ID[j]=ID[i];
                    ID[i]=tem;
                    te=av[j];
                    av[j]=av[i];
                    av[i]=te;
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
                        tem=ID[j];
                        ID[j]=ID[i];
                        ID[i]=tem;
                        te=av[j];
                        av[j]=av[i];
                        av[i]=te;
                    }
                }
            }
        }
        System.out.println("Student(s) in alphabetical order:"); 
        for(i=0;i<x;i++){
            System.out.println("[Name:"+fn[i]+" "+n[i]+" ID:"+ID[i]+" Avrage grade:"+av[i]+"]");
        }   
        for(i=0;i<x;i++){
            for(j=i+1;j<x;j++){
                if(av[i]<av[j]){
                    temp=fn[j];
                    fn[j]=fn[i];
                    fn[i]=temp;
                    temp=n[j];
                    n[j]=n[i];
                    n[i]=temp;
                    tem=ID[j];
                    ID[j]=ID[i];
                    ID[i]=tem;
                    te=av[j];
                    av[j]=av[i];
                    av[i]=te;
                }
            }
        }
        j=0;
        k=0;
        te=av[0];
        for(i=1;!(j==3)&&i<x;i++){
            if(te>av[i]){
                j++;
                if(j==3){
                    i--;
                }
                te=av[i];
            }
            if(j==2){
                if(k==0){
                    tem=i;
                }
                k++;
            }
        }
        tem1=i;
        System.out.println("----------------"); 
        if(j<2){
            System.out.println("there wasn't enough students"); 
        }
        else{
            System.out.println("Student(s) with 3rd best grade(there was "+k+"):"); 
            for(i=tem;i<tem1&&tem>=0;i++){
                System.out.println("[Name:"+fn[i]+" "+n[i]+" ID:"+ID[i]+" Avrage grade:"+av[i]+"]");
            }
        }
        System.out.print("----------------"); 
    }
}