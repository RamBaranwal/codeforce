import java.util.Scanner;

public class A_Amusing_Joke {
    private static String isReassembled(String s1, String s2, String s3){
        int[] fre = new int[26];

        for(int i = 0; i < s1.length(); i++){
            fre[s1.charAt(i) - 'A']++;
        }
        for(char ch : s2.toCharArray()){
            fre[ch - 'A']++;
        }
        for(char ch : s3.toCharArray()){
            fre[ch - 'A']--;
        }
        for(int i = 0; i < 26; i++){
            if(fre[i] != 0){
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        System.out.println(isReassembled(s1, s2, s3));
        sc.close();
    }
}