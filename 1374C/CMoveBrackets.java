import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.IOException;

/**
 * CMoveBrackets
 */
public class CMoveBrackets {

    private int minChange(String s, int n){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                stack.add('(');
            }
            else{
                if(stack.isEmpty()){
                    stack.add(')');
                }
                else{
                    if(stack.peek() != '('){
                        stack.add(')');
                    }
                    else{
                        stack.pop();
                    }
                }
            }
        }
        return stack.size() / 2;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        
        while(test > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            CMoveBrackets obj = new CMoveBrackets();
            int res = obj.minChange(s, n);
            System.out.println(res);
            test--;
        }
    }
}