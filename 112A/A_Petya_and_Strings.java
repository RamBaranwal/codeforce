import java.util.Scanner;

public class A_Petya_and_Strings {
    private int findEquality(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.compareTo(s2) < 0){
            return -1;
        }
        else if(s1.compareTo(s2) > 0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        A_Petya_and_Strings obj = new A_Petya_and_Strings();
        System.out.println(obj.findEquality(s1, s2));
        sc.close();
    }
}