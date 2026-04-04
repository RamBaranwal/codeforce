import java.util.Scanner;

public class A_1_Good_Matrix_Elements {
    private int findSum(int[][] arr){
        int sum = 0;
        // first middle row sum
        int row = arr.length / 2;
        for(int i = 0; i < arr.length; i++){
            sum += arr[row][i];
        }

        // second middle column sum
        int col = arr.length / 2;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i][col];
        }

        // third both diagonal sum
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(i == j){
                    sum += arr[i][j];
                    sum += arr[i][arr.length - j - 1];
                }
            }
        }
        sum = sum - (3 * arr[row][col]);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        A_1_Good_Matrix_Elements obj = new A_1_Good_Matrix_Elements();
        int res = obj.findSum(arr);
        System.out.println(res);
        sc.close();
    }
}