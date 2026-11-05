import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.io.IOException;

/**
 * ACoverInWater
 */
public class ACoverInWater {

    private int wantTofillWater(String str) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                count++;
            } else {
                if(count > 0){
                    map.put(count, map.getOrDefault(count, 0) + 1);
                }
                count = 0;
            }
        }

        if(count > 0){
            map.put(count, map.getOrDefault(count, 0) + 1);
        }

        int result = 0;
        for(int key : map.keySet()){
            if(key >= 3){
                return 2;
            }
            result += (map.get(key) * key);
        }

        return result;
        
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            ACoverInWater obj = new ACoverInWater();
            int res = obj.wantTofillWater(str);
            System.out.println(res);
        }
    }
}