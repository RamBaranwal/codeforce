import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * AGoalsOfVictory
 */
public class AGoalsOfVictory {

    private int findMissingGoal(int[] arr, int n){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return -sum;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test-- > 0){
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split("\\s+");
            int[] arr = new int[n - 1];
            for(int i = 0; i < n - 1; i++){
                arr[i] = Integer.parseInt(input[i]);
            }

            AGoalsOfVictory obj = new AGoalsOfVictory();
            int res = obj.findMissingGoal(arr, n);
            System.out.println(res);
        }
    }
}