import java.util.Scanner;

public class A_System_of_Equations {
    // equation
    // a^2 + b = n
    // b^2 + a = m
    private static int findPair(int n , int m){
        int count = 0;
        for(int a = 0; a * a <= n; a++){
            int b = n - (a * a);
            if((b * b) + a == m){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = findPair(n, m);
        System.out.println(res);
        sc.close();
    }
}
