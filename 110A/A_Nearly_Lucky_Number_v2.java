import java.util.Scanner;

public class A_Nearly_Lucky_Number_v2 {
    private boolean findLuckyNumber(long n){
        String str = String.valueOf(n);
        String luckyDigitOnly = str.replaceAll("[^47]", "");
        long lenghtOfLuckyDigit = luckyDigitOnly.length();
        if(String.valueOf(lenghtOfLuckyDigit).matches("[47]+")){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        A_Nearly_Lucky_Number_v2 obj = new A_Nearly_Lucky_Number_v2();
        boolean isLucky = obj.findLuckyNumber(n);
        if(isLucky){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}