import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * CTargetPractice
 */
public class CTargetPractice {

    private int totalPoints(char[][] arr){
        int sum = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(arr[i][j] == 'X'){
                    if(i == 0 || i == 9 || j == 0 || j == 9){
                        sum += 1;
                    }
                    else if(i == 1 || i == 8 || j == 1 || j == 8){
                        sum += 2;
                    }
                    else if(i == 2 || i == 7 || j == 2 || j == 7){
                        sum += 3;
                    }
                    else if(i == 3 || i == 6 || j == 3 || j == 6){
                        sum += 4;
                    }
                    else{
                        sum += 5;
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            char[][] arr = new char[10][10];
            for(int i = 0; i < 10; i++){
                String value = br.readLine().trim();
                for(int j = 0; j < 10; j++){
                    arr[i][j] = value.charAt(j);
                }
            }
            CTargetPractice obj = new CTargetPractice();
            int res = obj.totalPoints(arr);
            System.out.println(res);
        }
    }
}