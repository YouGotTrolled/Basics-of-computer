import java.util.Scanner;
public class taklifv2 {
    public static void main(String[] args){
        String[] yakab ={ "", "یک" ,"دو","سه","چهار","پنج","شش","هفت","هشت","نه"};
        String[] sadegan ={ "", "صد" ,"دویست","سیصد","چهارصد","پانصد","شانصد","هفتصد","هشتصد","نهصد"};
        String[] dahegan ={ "", "ده" ,"بیست","سی","چهل","پنجاه","شصت","هفتاد","هشتاد","نود"};
        String[] es ={"یازده" ,"دوازده","سیزده","چهارده","پانزده","شانزده","هوده","هجده","نوزده"};
        Scanner scan = new Scanner(System.in);
        int x=scan.nextInt();
        int temp=x/100;
        if(x-(temp*100)>10 && x-(temp*100)<20){
            temp=(x%10)-1;
            System.out.print(es[temp]);
        }
        else {
            temp=x%10;
            System.out.print(yakab[temp]);
            if(x%10!=0 && x/10!=0){
                System.out.print(" و ");
            }
            temp=((x%100)-(x%10))/10;
            System.out.print(dahegan[temp]);
        }
        if(x%100>9 && x/100!=0){
            System.out.print(" و ");
        }
        temp=x/100;
        System.out.print(sadegan[temp]);
    }
}