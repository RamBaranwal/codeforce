import java.util.Scanner;

public class A_Nearly_Lucky_Number {
    private boolean findLuckyNumber(long n){
        long count = 0;
        while(n > 0){
            long rem = n % 10;
            if(rem == 4 || rem == 7){
                count++;
            }
            n /= 10;
        }
        if(count == 0) return false;
        while(count > 0){
            long rem = count % 10;
            if(rem != 4 && rem != 7){
                return false;
            }
            count /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        A_Nearly_Lucky_Number obj = new A_Nearly_Lucky_Number();
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