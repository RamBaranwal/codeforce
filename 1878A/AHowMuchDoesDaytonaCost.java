import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * AHowMuchDoesDaytonaCost
 */
public class AHowMuchDoesDaytonaCost {

    private boolean isPossible(int[] arr, int n, int k){
        for(int i = 0; i < n; i++){
            if(arr[i] == k){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test-- > 0){
            String[] input = br.readLine().split("\\s+");
            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);
            String[] input2 = br.readLine().split("\\s+");
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(input2[i]);
            }

            AHowMuchDoesDaytonaCost obj = new AHowMuchDoesDaytonaCost();
            boolean res = obj.isPossible(arr, n, k);
            if(res){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}