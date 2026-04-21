import java.util.Scanner;

public class A_Panoramix_s_Prediction {
    private boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3; i * i <= n; i += 2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    private String findnextPrime(int n, int m){
        if(n == m) return "NO";
        if(!isPrime(m)) return "NO";
        for(int i = n + 1; i < m; i++){
            if(isPrime(i)) return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        A_Panoramix_s_Prediction obj = new A_Panoramix_s_Prediction();
        System.out.println(obj.findnextPrime(n, m));
        sc.close();
    }
}