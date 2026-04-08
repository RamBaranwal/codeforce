import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_Remove_Smallest {
    private String isTrue(ArrayList<Integer> arr){
        Collections.sort(arr);
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) - arr.get(i - 1) > 1){
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0; i < n; i++){
                arr.add(sc.nextInt());
            }
            A_Remove_Smallest obj = new A_Remove_Smallest();
            System.out.println(obj.isTrue(arr));
        }
        sc.close();
    }
}