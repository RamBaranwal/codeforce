// import java.util.Arrays;
import java.util.Scanner;

public class C_Paint_the_Array {
    private int findBeautifulNumber(int[] arr){
        // System.out.println(Arrays.toString(arr));
        // int min = Integer.MAX_VALUE;
        // if(arr.length == 2) return arr[1];
        // for(int i = 0; i < arr.length - 2; i += 2){
        //     int findMin;
        //     if(arr[i] % arr[i + 2] == 0 || arr[i + 2] % arr[i] == 0){
        //         findMin = Math.min(arr[i], arr[i + 2]);
        //         // System.out.println(findMin + "..");
        //     }
        //     // else if(arr[i + 1] % arr[i + 3])
        //     else{
        //         break;
        //     }
        //     min = Math.min(findMin, min);
        //     return min;
        // }
        ///////////////////////// wrong doing \\\\\\\\\\\\\\\\\\\\\\\\
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n; i++){
                arr[i] = sc.nextInt();
            }
            C_Paint_the_Array obj = new C_Paint_the_Array();
            int res = obj.findBeautifulNumber(arr);
            System.out.println(res);
        }
        sc.close();
    }
}