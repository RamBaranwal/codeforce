import java.util.Scanner;

public class ADominoPiling {
    private int findNumberSquareFitted(int n, int m){
        return (n * m) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ADominoPiling obj = new ADominoPiling();
        int res = obj.findNumberSquareFitted(n, m);
        System.out.println(res);
        sc.close();
    }
}