import java.util.Scanner;

public class A_Chips {
    private int findRemains(int n , int m){
        while(m > 0){
            for(int i = 1; i <= n; i++){
                if(m < i){
                    return m;
                }
                m = m - i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        A_Chips obj = new A_Chips();
        int res = obj.findRemains(n, m);
        System.out.println(res);
        sc.close();
    }
}