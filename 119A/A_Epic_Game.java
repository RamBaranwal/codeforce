import java.util.Scanner;

public class A_Epic_Game {
    private static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    private static String findWin(int si, int an, int total){
        // the wile loop help to again and again turn it cannot finnish
        // but it is not making the infinite loop but whe nwe found the ans it break their
        // the main thing is that it always goes subtraction so on easy solution we use it
        while(true){
            total = total - gcd(si, total);
            // if simon make the total 0 it means we cannot move forward we already know the winner
            // because if we see next one it will lose already
            // here we check at same point not going next like question given
            if(total == 0){
                return "simon";
            }
            total = total - gcd(an, total);
            if(total == 0){
                return "antisimon";
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int si = sc.nextInt();
        int an = sc.nextInt();
        int total = sc.nextInt();
        String win = findWin(si, an, total);
        if(win.equals("antisimon")){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}