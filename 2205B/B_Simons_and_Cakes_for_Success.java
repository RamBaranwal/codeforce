import java.util.Scanner;

public class B_Simons_and_Cakes_for_Success {
    private long findK(int n){
        long mul = 1;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                mul *= i;
                while(n % i == 0){
                    n /= i;
                }
            }
        }
        if(n > 1){
            mul *= n;
        }
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            B_Simons_and_Cakes_for_Success obj = new B_Simons_and_Cakes_for_Success();
            long res = obj.findK(n);
            System.out.println(res);
        }
        sc.close();
    }
}