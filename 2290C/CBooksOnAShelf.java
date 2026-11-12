
import java.io.*;
import java.util.*;

public class CBooksOnAShelf {
    private int[] adjust(int[] height, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : height) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());
        int[] res = new int[n];
        int left = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            res[left++] = entry.getKey();
        }
        for (Map.Entry<Integer, Integer> entry : list) {
            int extra = Math.max(0, entry.getValue() - 2);
            while (extra-- > 0) {
                res[left++] = entry.getKey();
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            Map.Entry<Integer, Integer> entry = list.get(i);
            if (entry.getValue() >= 2) {
                res[left++] = entry.getKey();
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] height = new int[n];
            for (int i = 0; i < n; i++) {
                height[i] = Integer.parseInt(st.nextToken());
            }
            CBooksOnAShelf obj = new CBooksOnAShelf();
            int[] adj = obj.adjust(height, n);
            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int x : height) {
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
            int k = 0;
            for (int f : freq.values()) {
                k += Math.min(f, 2);
            }
            System.out.println(k);
            for (int x : adj) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
