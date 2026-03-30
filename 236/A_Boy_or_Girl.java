import java.util.Arrays;
import java.util.Scanner;

public class A_Boy_or_Girl {
    private int uniChar(String st){
        char[] ch = st.toCharArray();
        Arrays.sort(ch);
        int count = 1;
        for(int i = 1; i < st.length(); i++){
            if(ch[i] != ch[i - 1]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        A_Boy_or_Girl obj = new A_Boy_or_Girl();
        int res = obj.uniChar(str);
        if(res % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}
