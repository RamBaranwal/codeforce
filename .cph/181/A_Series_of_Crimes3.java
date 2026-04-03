import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_Series_of_Crimes3 {
    private int[] fourthCrime(char[][] arr){
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == '*'){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        int x = 0;
        if(row.get(0).equals(row.get(1))){
            x = row.get(2);
        }
        else if(row.get(0).equals(row.get(2))){
            x = row.get(1);
        }
        else{
            x = row.get(0);
        }

        int y = 0;
        if(col.get(0).equals(col.get(1))){
            y = col.get(2);
        }
        else if(col.get(0).equals(col.get(2))){
            y = col.get(1);
        }
        else{
            y = col.get(0);
        }
        return new int[] {x,y};
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
        A_Series_of_Crimes3 obj = new A_Series_of_Crimes3();
        int[] result = obj.fourthCrime(ch);
        int rowRobbed = result[0] + 1;
        int colRobbed = result[1] + 1;
        System.out.println(rowRobbed + " " + colRobbed);
        sc.close();
    }
}