// package Special_Questions;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;


public class Accenture1 {
    private int findMaxSumOfStrictPeek(int[] arr){
        int[] leftSum = new int[arr.length];
        int[] rightSum = new int[arr.length];

        leftSum[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i - 1]){
                leftSum[i] = arr[i] + leftSum[i - 1];
            }
            else{
                leftSum[i] = arr[i];
            }
        }

        rightSum[arr.length - 1] = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] > arr[i + 1]){
                rightSum[i] = rightSum[i + 1] + arr[i];
            }
            else{
                rightSum[i] = arr[i];
            }
        }

        int maxSum = 0;
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                int currSum = leftSum[i] + rightSum[i] - arr[i];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] input1 = input.split("\\s+");
        int[] arr = new int[input1.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(input1[i]);
        }
        
        // find the sum of the continuous array having strict increasing and decreasing where
        Accenture1 obj = new Accenture1();
        int result = obj.findMaxSumOfStrictPeek(arr);
        System.out.println(result);
    }
}
