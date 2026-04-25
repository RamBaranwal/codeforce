package Special_Questions;
import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Fund_Return_Allocation {
    private int findMaxProfit(int[][] arr, int m){
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        Maximum_Fund_Return_Allocation obj = new Maximum_Fund_Return_Allocation();
        int maxProfit = obj.findMaxProfit(arr, m);
        System.out.println(maxProfit);
        sc.close();
    }
}
