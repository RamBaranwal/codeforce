import java.util.Scanner;

public class B_Creating_the_Contest {
    private int findSubsetOfContest(int[] arr){
        int count = 1;
        int max = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] <= 2 * arr[i - 1]){
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res = new int[n];
        for(int i = 0 ; i < n; i++){
            res[i] = sc.nextInt();
        }

        B_Creating_the_Contest obj = new B_Creating_the_Contest();
        int result = obj.findSubsetOfContest(res);
        System.out.println(result);
        sc.close();
    }
}