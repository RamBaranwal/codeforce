import java.util.Scanner;

public class A_Presents {
    private int[] findPerson(int[] arr){
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            res[arr[i] - 1] = i + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = sc.nextInt();
        }
        A_Presents obj = new A_Presents();
        int[] arr = obj.findPerson(res);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}