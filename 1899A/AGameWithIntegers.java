import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * AGameWithIntegers
 */
public class AGameWithIntegers {

    private String theWinner(int n){
        if(n % 3 == 0){
            return "Second";
        }
        return "First";
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test-- > 0){
            int n = Integer.parseInt(br.readLine());
            AGameWithIntegers obj = new AGameWithIntegers();
            String res = obj.theWinner(n);
            System.out.println(res);
        }
    }
}