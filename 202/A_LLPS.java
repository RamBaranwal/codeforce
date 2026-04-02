import java.util.Scanner;

public class A_LLPS {
    private static String LexicographicallyLargestPalindromicSubsequence(String st){
        int[] fre = new int[26];
        for(char ch : st.toCharArray()){
            fre[ch - 'a']++;
        }
        int index = 0;
        for(int i = 25; i >= 0; i--){
            if(fre[i] > 0){
                index = i;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < fre[index]; i++){
            sb.append((char)(index + 'a'));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = LexicographicallyLargestPalindromicSubsequence(str);
        System.out.println(res);
        sc.close();
    }
}