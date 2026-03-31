import java.util.Scanner;

public class A_Perfect_Permutation {
    
    private void perfectPermutation(int n){
        if(n % 2 != 0){
            System.out.println(-1);
            return;
        }

        for(int i = 1; i <= n; i += 2){
            System.out.print((i + 1) + " " + i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        A_Perfect_Permutation obj = new A_Perfect_Permutation();
        obj.perfectPermutation(n);

        sc.close();
    }
}