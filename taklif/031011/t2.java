import java.util.Scanner;
public class t2{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("What will the size?\ncollen?");
        int y1=scan.nextInt();
        System.out.println("row?");
        int x1=scan.nextInt();
        int[][] matrix1=new int[x1][y1];
        System.out.println("What will the size?\ncollen?");
        int y2=scan.nextInt();
        System.out.println("row?");
        int x2=scan.nextInt();
        int[][] matrix2=new int[x2][y2];
        if(y1==x2){
            int i;
            int j;
            int k;
            int sum;
            int[][] matrix3=new int[x1][y2];
            for(i=0;i<x1;i++){
                for(j=0;j<y1;j++){
                    System.out.print("matrix1["+(i+1)+"]["+(j+1)+"]:");
                    matrix1[i][j]=scan.nextInt();
                }
            }
            for(i=0;i<x2;i++){
                for(j=0;j<y2;j++){
                    System.out.print("matrix2["+(i+1)+"]["+(j+1)+"]:");
                    matrix2[i][j]=scan.nextInt();
                }
            }
            for(i=0;i<x1;i++){
                for(j=0;j<y2;j++){
                    sum=0;
                    for(k=0;k<x2;k++){
                        sum+=matrix1[i][k]*matrix2[k][j];
                    }
                    matrix3[i][j]=sum;
                }
            }
            System.out.print("[");
            for(i=0;i<x1;i++){
                System.out.print("[ ");
                for(j=0;j<y1;j++){
                    System.out.print(matrix1[i][j]+" ");
                }
                if(i==x1-1){
                    System.out.print("]");
                }
                else{
                    System.out.println("],");
                }
            }
            System.out.print("]\n*\n[");
            for(i=0;i<x2;i++){
                System.out.print("[ ");
                for(j=0;j<y2;j++){
                    System.out.print(matrix2[i][j]+" ");
                }
                if(i==x2-1){
                    System.out.print("]");
                }
                else{
                    System.out.println("],");
                }
            }
            System.out.print("]\n=\n[");
            for(i=0;i<x1;i++){
                System.out.print("[ ");
                for(j=0;j<y2;j++){
                    System.out.print(matrix3[i][j]+" ");
                }
                if(i==x1-1){
                    System.out.print("]");
                }
                else{
                    System.out.println("],");
                }
            }
            System.out.print("]");
        }
        else {
            System.out.print("error");
        }
    }
}