import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class un3{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("String?");
        String in=scan.nextLine();
        first(in);
        second(in);
    }
    public static void first(String a){
        String temp;
        StringTokenizer spt = new StringTokenizer(a);
        int i=0;
        while(spt.hasMoreTokens()){
            i++;
            spt.nextToken();
        }
        spt = new StringTokenizer(a);
        String[] words=new String[i];
        int[] repeat=new int[i];
        i=0;
        while(spt.hasMoreTokens()){
            boolean flag=true;
            temp=spt.nextToken();
            int j=0;
            for(;j<i&&flag;j++){
                if(words[j].equals(temp)){
                    flag=false;
                }
            }
            if(!flag){
                repeat[--j]++;
            }else{
                words[i]=temp;
                repeat[i++]=1;
            }
        }
        for(i=0;i<words.length;i++){
            System.out.println(words[i]+"="+repeat[i]);
        }
    }
    public static void second(String a){
        try{
            String temp;
            String tem;
            StringTokenizer spt = new StringTokenizer(a);
            PrintWriter writer=new PrintWriter(new FileWriter("reverse.txt"));
            while(spt.hasMoreTokens()){
                tem="";
                temp=spt.nextToken();
                for(int i=(temp.length()-1);i>-1;i--){
                    tem+=String.valueOf(temp.charAt(i));
                }
                writer.print(tem+" ");
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}