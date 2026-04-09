import java.util.Scanner;

public class A_Soft_Drinking {
    private int findToasts(int n, int k, int l, int c, int d, int p, int nl, int np){
        int nkToast = (l * k) / nl;
        int cdToast = (c * d);
        int pToast = (p / np);
        return (Math.min(Math.min(nkToast, cdToast), pToast) / n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        A_Soft_Drinking obj = new A_Soft_Drinking();
        System.out.println(obj.findToasts(n, k, l, c, d, p, nl, np));
        sc.close();
    }
}