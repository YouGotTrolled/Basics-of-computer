import java.util.Scanner;
public class un5{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("tadad?");
        int n=scan.nextInt();
        scan.nextLine();
        String[] list1=new String[n];
        String[] list2=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("?");
            list1[i]=scan.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.println("?");
            list2[i]=scan.nextLine();
        }
        String[] list3=first(list1,list2);
        
    }
    public static String[] first(String[] a,String[] b){
        String temp;
        String[] c=new String[2*(a.length)];
        String[] d=new String[2*(a.length)];
        for(int i=0;i<a.length;i++){
            d[i]=a[i];
        }
        for(int i=0;i<a.length;i++){
            d[i+(a.length)]=b[i];
        }
        int k=-1;
        for(int i=0;i<a.length;i++){
            int t=0;
            for(int j=0;j<d.length&&(t<2);j++){
                if(a[i].equals(d[j])){
                    t++;
                }
            }
            if(t==1){
                c[++k]=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            int t=0;
            for(int j=0;j<d.length&&(t<2);j++){
                if(b[i].equals(d[j])){
                    t++;
                }
            }
            if(t==1){
                c[++k]=b[i];
            }
        }
        for(int i=0;i<k;i++){
            for(int j=i+1;j<k;j++){
                if(c[i].compareTo(c[j])>0){
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        return(c);
    }
}