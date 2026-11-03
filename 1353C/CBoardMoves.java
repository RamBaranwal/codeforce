/**
 * CBoardMoves
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CBoardMoves {

    private long totalMoves(int num){
        int val = num / 2;
        int i = 0;
        long moves = 0;
        while(val > 0){
            moves += (long)(val * ((((long)(num - i)) * 4) - 4));
            val--;
            i += 2;
        }
        return moves;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test > 0) {
            int num = Integer.parseInt(br.readLine());
            CBoardMoves obj = new CBoardMoves();
            long res = obj.totalMoves(num);
            System.out.println(res);
            test--;
        }
    }
}