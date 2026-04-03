import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_Series_of_Crimes1 {
    private int[] fourthCrime(char[][] arr){
        List<int[]> points = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == '*'){
                    points.add(new int[] {i, j});
                }
            }
        }
        
        int x = points.get(0)[0] ^ points.get(1)[0] ^ points.get(2)[0];
        int y = points.get(0)[1] ^ points.get(1)[1] ^ points.get(2)[1];

        return new int[] {x, y};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] ch = new char[n][m];
        for(int i = 0; i < n; i++){
            String line = sc.next();
            for(int j = 0; j < m; j++){
                ch[i][j] = line.charAt(j);
            }
        }
        A_Series_of_Crimes1 obj = new A_Series_of_Crimes1();
        int[] result = obj.fourthCrime(ch);
        int rowRobbed = result[0] + 1;
        int colRobbed = result[1] + 1;
        System.out.println(rowRobbed + " " + colRobbed);
        sc.close();
    }
}