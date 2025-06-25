import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String s;
    while(true){
        s = scanner.nextLine();

        if(s.equals(".")){
            break;
        }
        System.out.println(back4949(s));
    }

    }

    public static String back4949(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);

            // 여는 괄호
            if(c=='('|| c=='['){
                stack.push(c);
            }

            else if (c==')'){
                if(stack.empty() || stack.peek()!='('){
                    return "no";
                }
                else{
                    stack.pop();
                }
            }

            else if (c==']'){
                if(stack.empty() || stack.peek() != '['){
                    return "no";
                }
                else{
                    stack.pop();
                }
            }



        }
        if(stack.empty()){
            return "yes";
        }
        else{
            return "no";
        }
    }

}