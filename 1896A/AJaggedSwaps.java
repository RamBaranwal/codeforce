import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * AJaggedSwaps
 */
public class AJaggedSwaps {
    private static boolean isAbleToDo(int[] arr, int n){
        for(int j = 0; j < n; j++){
            for(int i = 1; i < n - 1; i++){
                if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test-- > 0){
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();
            String input1[] = input.split("\\s+");
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(input1[i]);
            }

            boolean res = isAbleToDo(arr, n);
            if(res){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}