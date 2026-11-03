import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ATheBestCard
 */
public class ATheBestCard {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ATheBestCard obj = new ATheBestCard();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(obj.isWin(n));
        }
    }
    private String isWin(int n){
        for(int i = n; i >= 2; i--){
            if((n + 1) % (i) == 0){
                return "NO";
            }
        }
        return  "YES";
    }
}