import java.util.Scanner;

// not easy to do it like this by recursion it needs high thinking level
// we have to do something crazy then this solution or approach comes in mind
public class A_Amusing_Joke_byRecursion {
    private String isReassembled(String s1, String s2, String s3){
        if(s1.length() + s2.length() != s3.length()){
            return "NO";
        }
        return helper(s1 + s2 , s3 ,0) ? "YES" : "NO";
    }
    private boolean helper(String combine, String s3, int index){
        if(s3.length() == index){
            return true;
        }

        char ch = s3.charAt(index);
        int i = combine.indexOf(ch);

        if(i == -1){
            return false;
        }

        String newCombine = combine.substring(0, i) + combine.substring(i + 1);

        return helper(newCombine, s3, index + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        A_Amusing_Joke_byRecursion obj = new A_Amusing_Joke_byRecursion();
        System.out.println(obj.isReassembled(s1, s2, s3));
        sc.close();
    }
}