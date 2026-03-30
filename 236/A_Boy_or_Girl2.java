import java.util.HashSet;
import java.util.Scanner;

public class A_Boy_or_Girl2 {
    private int uniChar(String st){
        HashSet<Character> set = new HashSet<>();
        for(char ch : st.toCharArray()){
            set.add(ch);
        }
        return set.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        A_Boy_or_Girl2 obj = new A_Boy_or_Girl2();
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
