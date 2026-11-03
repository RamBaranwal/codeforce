/**
 * AConsecutiveSumRiddle
 */
import java.io.*;
public class AConsecutiveSumRiddle {

    private long[] startEnd(long n){
        long[] ans = new long[2];
        ans[0] = 1 - n;
        ans[1] = n;
        return ans;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test-- > 0){
            AConsecutiveSumRiddle obj = new AConsecutiveSumRiddle();
            long num = Long.parseLong(br.readLine());
            long[] res = obj.startEnd(num);
            System.out.println(res[0] + " " + res[1]);
        }
    }
}