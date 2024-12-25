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
            int i1;
            int j1;
            int i2;
            int j2;
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
                    i1=i;
                    j1=0;
                    i2=0;
                    j2=j;
                    sum=0;
                    for(k=0;k<x2;k++){
                        sum+=matrix1[i1][j1++]*matrix2[i2++][j2];
                    }
                    matrix3[i][j]=sum;
                }
            }
            for(i=0;i<x1;i++){
                for(j=0;j<y2;j++){
                    System.out.println("matrix3["+(i+1)+"]["+(j+1)+"]="+matrix3[i][j]);
                }
            }

        }
        else {
            System.out.print("error");
        }
    }
}