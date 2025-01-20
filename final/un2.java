import java.io.*;
import java.util.StringTokenizer;
public class un2{
    public static void main(String[] args){
        String[] harf={"koni","kon","kossher"};
        first("Alpha.txt",harf);
    }
    public static void first(String loc,String[] harf){
        try{
            String tem="";
            StringTokenizer token;
            File te=new File("temp.txt");
            BufferedReader reader = new BufferedReader(new FileReader(loc));
            PrintWriter writer=new PrintWriter(new FileOutputStream("temp.txt"));
            String temp=reader.readLine();
            while(temp!=null){
                writer.println(temp);
                temp=reader.readLine();
            }
            reader.close();
            writer.close();
            reader = new BufferedReader(new FileReader("temp.txt"));
            writer=new PrintWriter(new FileOutputStream(loc));
            temp=reader.readLine();
            while(temp!=null){
                token=new StringTokenizer(temp);
                tem="";
                while(token.hasMoreTokens()){
                    temp=token.nextToken();
                    boolean flag=true;
                    for(int i=0;i<harf.length&&flag;i++){
                        if(temp.equals(harf[i])){
                            flag=false;
                        }
                    }
                    if(flag){
                        tem+=temp+" ";
                    }
                }
                writer.println(tem);
                temp=reader.readLine();
            }
            reader.close();
            writer.close();
            te.delete();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}