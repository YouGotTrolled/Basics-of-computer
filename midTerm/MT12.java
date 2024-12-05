public class MT12{
    public static void main(String[] args){
        int t;
        int sum;
        int j = 1;
        int temp;
        for(int x=1;x<100000;x++){
            t=x;
            sum = 0;
            for(;t>=1;t/=10){
                temp = t%10;
                j=1;
                for(;temp>1;temp--){
                    j *= temp;
                }
                sum += j;
            }
            if(sum==x){
                System.out.print(x+" ");
            }
        }
    }
}