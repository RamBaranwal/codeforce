import java.util.Scanner;

public class A_Next_Round {
    private int findQualified(int arr[], int k){
        int count = 0;
        int kthPosition = arr[k - 1];
        for(int n : arr){
            if(n >= kthPosition && n > 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] contestant = new int[n];
        for(int i = 0; i < n; i++){
            contestant[i] = sc.nextInt();
        }
        A_Next_Round obj = new A_Next_Round();
        System.out.println(obj.findQualified(contestant, k));
        sc.close();
        }
}