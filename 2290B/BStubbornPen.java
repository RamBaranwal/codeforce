import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BStubbornPen
 */
public class BStubbornPen {
    private int manualllySwitch(String s, int n){
        int count = 0;
        if(s.charAt(0) == 'B'){
            count++;
        }
        for(int i = 1; i < n; i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            BStubbornPen obj = new BStubbornPen();
            int res = obj.manualllySwitch(s, n);
            System.out.println(res);
        }
    }
}