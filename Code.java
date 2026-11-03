import java.util.*;
import java.io.*;

public class Code {

    private int totalCommonRowCol(String str){
        int n = (int)Math.sqrt(str.length());
        if(n * n != str.length()){
            return 0;
        }
        char[][] arr = new char[n][n];
        int k = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = str.charAt(k);
                k++;
            }
        }
        
        int res = 0;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 1; j < n; j++){
                if(arr[i][j] == arr[i][j - 1]){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count == n - 1){
                res++;
            }
        }
        for(int j = 0; j < n; j++){
            int count = 0;
            for(int i = 1; i < n; i++){
                if(arr[i][j] == arr[i - 1][j]){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count == n - 1){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Code obj = new Code();
        int n = obj.totalCommonRowCol(str);
        System.out.println(n);
        br.close();
    }
}