import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ADonTTryToCount
 */
public class ADonTTryToCount {

    private int minSteps(String x, String s){
        StringBuilder sb = new StringBuilder(x);
        int count = 0;
        while(sb.length() <= 25){
            if(sb.indexOf(s) != -1){
                return count;
            }
            sb.append(sb);
            count++;
        }
        if(sb.indexOf(s) != -1){
            return count;
        }
        return -1;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            String[] input = br.readLine().split("\\s+");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            String x = br.readLine();
            String s = br.readLine();

            ADonTTryToCount obj = new ADonTTryToCount();
            int res = obj.minSteps(x, s);
            System.out.println(res);
        }
    }
}