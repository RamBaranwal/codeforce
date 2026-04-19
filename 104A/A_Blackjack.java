import java.util.Scanner;

public class A_Blackjack {
    private int findNumberOfCards(int n){
        if(n <= 10){
            return 0;
        }
        else if(n >= 11 && n <= 19){
            return 4;
        }
        else if(n == 20){
            return 15;
        }
        else if(n == 21){
            return 4;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        A_Blackjack obj = new A_Blackjack();
        int res = obj.findNumberOfCards(n);
        System.out.println(res);
        sc.close();
    }
}