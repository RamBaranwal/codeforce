/**
 * BMultiplyBy2DivideBy6
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BMultiplyBy2DivideBy6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
            // System.out.println(n);
        String[] arr = br.readLine().split(" ");
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = Integer.parseInt(arr[i]);
        }

         

    }
}