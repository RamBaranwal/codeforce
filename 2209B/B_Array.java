import java.util.Scanner;

public class B_Array {
    private int[] maximumNumber(int[] nums){
        if(nums.length == 1) return new int[] {0};
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int greaterCount = 0;
            int lesserCount = 0;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    greaterCount++;
                }
                else if(nums[i] < nums[j]){
                    lesserCount++;
                }
                else{
                    continue;
                }
            }
            res[i] = Math.max(greaterCount, lesserCount);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            B_Array obj = new B_Array();
            int[] res = obj.maximumNumber(arr);
            for(int i = 0; i < n; i++){
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}