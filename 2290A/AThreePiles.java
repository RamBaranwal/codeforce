import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * AThreePiles
 */
public class AThreePiles {

    private boolean isPossible(int a, int b, int c){
        if(a + 1 == b && b == c - 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            String[] input = br.readLine().split("\\s+");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            AThreePiles obj = new AThreePiles();
            boolean res = obj.isPossible(a, b, c);
            if(res){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}