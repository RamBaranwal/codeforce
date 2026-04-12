import java.util.Scanner;

// i am not able to understand the langiage of the question
// but GPT help me what it want the n it is very easy to do
public class A_Initial_Bet {
    private int findBet(int n1, int n2, int n3, int n4, int n5){
        int sum = n1 + n2 + n3 + n4 + n5;
        if(sum % 5 != 0){
            return -1;
        }
        int res = sum / 5;
        return res == 0 ? -1 : res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();

        A_Initial_Bet obj = new A_Initial_Bet();
        int res = obj.findBet(n1, n2, n3, n4, n5);
        System.out.println(res);
        sc.close();
    }
}