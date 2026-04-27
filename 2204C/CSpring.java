import java.util.Scanner;

public class CSpring {
    private static long GCD(long a, long b) {
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }

    private static long lcm(long a, long b) {
        return (a / GCD(a, b) * b);
    }

    private static String findWaterEachGet(long a, long b, long c, long m) {
        long A = m / a;
        Long B = m / b;
        long C = m / c;

        long ab = lcm(a, b);
        long bc = lcm(b, c);
        long ca = lcm(c, a);

        long AB = m / ab;
        long BC = m / bc;
        long CA = m / ca;

        long abc = lcm(a, bc);
        long ABC = m / abc;

        long onlyA = A - AB - CA + ABC;
        long onlyB = B - AB - BC + ABC;
        long onlyC = C - CA - BC + ABC;

        long onlyAB = AB - ABC;
        long onlyBC = BC - ABC;
        long onlyCA = CA - ABC;

        long onlyABC = ABC;

        long ahave = onlyA * 6 + onlyAB * 3 + onlyCA * 3 + onlyABC * 2;
        long bhave = onlyB * 6 + onlyAB * 3 + onlyBC * 3 + onlyABC * 2;
        long chave = onlyC * 6 + onlyBC * 3 + onlyCA * 3 + onlyABC * 2;

        return ahave + " " + bhave + " " + chave;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long m = sc.nextLong();

            System.out.print(findWaterEachGet(a, b, c, m));
            System.out.println();
        }
        sc.close();
    }

}