import java.util.Scanner;

public class A_I_love_username {
    private int amazingContest(int[] scores) {
        int count = 0;
        int max = scores[0];
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
                count++;
            } else if (scores[i] < min) {
                min = scores[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        A_I_love_username obj = new A_I_love_username();
        int res = obj.amazingContest(scores);
        System.out.println(res);
        sc.close();
    }
}