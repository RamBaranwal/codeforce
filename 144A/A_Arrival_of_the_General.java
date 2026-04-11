import java.util.Scanner;

public class A_Arrival_of_the_General {
    private int findSecond(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(min >= arr[i]){
                min = arr[i];
                minIndex = i;
            }
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        int minSec = arr.length - (minIndex + 1);
        minSec = minSec + maxIndex;
        if(minIndex < maxIndex){
            minSec -= 1;
        }
        return minSec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = sc.nextInt();
        }
        A_Arrival_of_the_General obj = new A_Arrival_of_the_General();
        int result = obj.findSecond(res);
        System.out.println(result);
        sc.close();
    }
}