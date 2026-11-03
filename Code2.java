import java.io.*;
public class Code2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] input1 = input.split("\\s+");
        int[] arr = new int[input1.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(input1[i]);
        }
        for(int i = 0; i < arr.length; i++){
            int temp = arr[i] - ((i % 7) * 3);
            if(arr[i] % 11 == 0){
                temp += (arr[i] / 11);
            }
            arr[i] = temp;
        }
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.println(sum);
        br.close();
    }
}
