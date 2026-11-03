import java.util.Scanner;

public class BDrinks {

    private double findProportion(int[] res){
        double portion = 0;
        double total = res.length;
        for(int i = 0; i < res.length; i++){
            portion += (res[i] / 100.00);
        }
        return (portion / total) * 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        BDrinks obj = new BDrinks();
        double res = obj.findProportion(arr);
        System.out.println(String.format("%.12f",res));
        sc.close();
    }
}