import java.util.Scanner;

public class B_Simons_and_Cakes_for_Success {
    private int findK(int n){
        for(int i = 1; i < Integer.MAX_VALUE; i++){
            long res = (long)Math.pow(i, n);
            if(res % n == 0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            B_Simons_and_Cakes_for_Success obj = new B_Simons_and_Cakes_for_Success();
            int res = obj.findK(n);
            System.out.println(res);
        }
    }
}