import java.util.Scanner;

public class A_Ultra_Fast_Mathematician {

    private String result(String n, String m){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n.length(); i++){
            int nch = (int) n.charAt(i) - '0';
            int mch = (int) m.charAt(i) - '0';
            int xor = nch ^ mch;
            sb.append(xor);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String m = sc.nextLine();

        A_Ultra_Fast_Mathematician obj = new A_Ultra_Fast_Mathematician();
        String res = obj.result(n, m);
        System.out.println(res);
        sc.close();
    }
}