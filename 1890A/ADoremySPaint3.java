import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class ADoremySPaint3 {
    private boolean isPossible(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        if(map.size() == 1){
            return true;
        }
        else if(map.size() > 2){
            return false;
        }
        else{
            ArrayList<Integer> list = new ArrayList<>(map.values());
            int a = list.get(0);
            int b = list.get(1);
            if(a == b || a + 1 == b || a - 1 == b){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test-- > 0){
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();
            String[] in = input.split("\\s+");
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(in[i]);
            }
            ADoremySPaint3 obj = new ADoremySPaint3();
            boolean res = obj.isPossible(arr, n);
            if(res){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}