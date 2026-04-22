import java.util.Scanner;

public class A_Way_Too_Long_Words {
    private static void writeWord(String str){
        if(str.length() <= 10){
            System.out.println(str);
            return;
        }
        System.out.println("" + str.charAt(0) + (str.length() - 2) + str.charAt(str.length() - 1));
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String str = sc.nextLine();
            writeWord(str);
        }
        sc.close();
    }
}