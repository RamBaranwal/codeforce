import java.util.ArrayList;
import java.util.Scanner;

public class Find_largest_element_from_the_previous_last_element{
    private ArrayList<Integer> amazingContest(int[] scores){
        ArrayList<Integer> res = new ArrayList<>();
        res.add(scores[0]);
        for(int i = 1; i < scores.length; i++){
            if(res.get(res.size() - 1) < scores[i]){
                res.add(scores[i]);
            }
        }
        res.remove(0);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for(int i = 0; i < n; i++){
            scores[i] = sc.nextInt();
        }
        Find_largest_element_from_the_previous_last_element obj = new Find_largest_element_from_the_previous_last_element();
        ArrayList<Integer> res = obj.amazingContest(scores);
        System.out.println(res);
        sc.close();
    }
}