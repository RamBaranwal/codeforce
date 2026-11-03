/**
 * BStakesAndShapes
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException;
public class BStakesAndShapes {

    private String bobPlayes(int rock, int scissors, int paper){
        String s = "";
        int moves = rock + paper + scissors;
        int maxOne = Math.max(rock, Math.max(paper, scissors));
        if(maxOne == rock){
            while(moves > 0){
                s += "P";
                moves--;
            }
        }
        else if(maxOne == scissors){
            while (moves > 0) {
                s += "R";
                moves--;
            }
        }
        else{
            while (moves > 0) {
                s += "S";
                moves--;
            }
        }
        return s;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test > 0) {
            String input = br.readLine();
            String[] str = input.split("\\s+");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);
            BStakesAndShapes obj = new BStakesAndShapes();
            String res = obj.bobPlayes(x, y, z);
            System.out.println(res);
            test--;
        }
    }
}