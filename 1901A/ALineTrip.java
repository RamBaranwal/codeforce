import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ALineTrip {

    private int minGasReq(int[] gasStation, int n, int x){
        if(n == 0){
            return 2 * x;
        }
        int max = 2 * (x - gasStation[n - 1]);
        for(int i = n - 1; i >= 1; i--){
            max = Math.max(max, gasStation[i] - gasStation[i - 1]);
        }
        max = Math.max(max, gasStation[0] - 0);
        return max;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test-- > 0){
            String input1 = br.readLine();
            String[] in1 = input1.split("\\s+");
            int n = Integer.parseInt(in1[0]);
            int x = Integer.parseInt(in1[1]);

            String input2 = br.readLine();
            String[] in2 = input2.split("\\s+");
            int[] gasStation = new int[n];
            for(int i = 0; i < n; i++){
                gasStation[i] = Integer.parseInt(in2[i]);
            }

            ALineTrip obj = new ALineTrip();
            int res = obj.minGasReq(gasStation, n, x);
            System.out.println(res);
        }
    }
}