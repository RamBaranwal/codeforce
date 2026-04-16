import java.util.Scanner;

public class A_Tram {
    private int findMaxPersonIntoTram(int[][] arr){
        int rem = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            rem = rem + arr[i][1] - arr[i][0];
            max = Math.max(max, rem);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] res = new int[n][2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                res[i][j] = sc.nextInt();
            }
        }
        A_Tram obj = new A_Tram();
        System.out.println(obj.findMaxPersonIntoTram(res));
        sc.close();
    }
}