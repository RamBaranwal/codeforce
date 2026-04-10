import java.util.Scanner;

public class A_insommia_cure_wrong_but_helpful {
    private int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    private static int findDamagedDragon(int k, int l, int m, int n, int d) {
        if (k == 1 || l == 1 || m == 1 || n == 1)
            return d;
        int common = k * l * m * n;
        int count = 1;
        for (int i = 2; i <= d; i++) {
            A_insommia_cure_wrong_but_helpful obj = new A_insommia_cure_wrong_but_helpful();
            int res = obj.GCD(i, common);
            if (res != k && res != l && res != m && res != n) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(findDamagedDragon(k, l, m, n, d));
        sc.close();
    }
}