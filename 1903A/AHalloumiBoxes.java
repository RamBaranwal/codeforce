/**
 * AHalloumiBoxes
 */
import java.io.*;
public class AHalloumiBoxes {

    private String isPossible(int[] arr, int len, int k){
        if(len == 1){
            return "YES";
        }
        if(k == 1){
            for(int i = 1; i < len; i++){
                if(arr[i] < arr[i - 1]){
                    return "NO";
                }
            }
        }
        return "YES";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test-- > 0){
            String input1 = br.readLine();
            String[] in1 = input1.split("\\s+");
            int len = Integer.parseInt(in1[0]);
            int k = Integer.parseInt(in1[1]);
            String input2 = br.readLine();
            String[] in2 = input2.split("\\s+");
            int[] arr = new int[len];
            for(int i = 0; i < len; i++){
                arr[i] = Integer.parseInt(in2[i]);
            }

            AHalloumiBoxes obj = new AHalloumiBoxes();
            String res = obj.isPossible(arr, len, k);
            System.out.println(res);
        }
    }
}