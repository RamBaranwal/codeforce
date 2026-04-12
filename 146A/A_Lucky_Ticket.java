import java.util.Scanner;

public class A_Lucky_Ticket {
    private String isLucky(int n, String l) {
        int firstHalf = 0;
        int secondHalf = 0;
        for(int i = 0; i < n; i++){
            if(l.charAt(i) != '4' && l.charAt(i) != '7'){
                return "NO";
            }
            if(i < n / 2){
                firstHalf += l.charAt(i) - '0';
            }
            else{
                secondHalf += l.charAt(i) - '0';
            }
        }
        if(firstHalf != secondHalf){
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String l = sc.next();
        A_Lucky_Ticket obj = new A_Lucky_Ticket();
        System.out.println(obj.isLucky(n, l));
        sc.close();
    }
}