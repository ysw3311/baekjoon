import java.io.BufferedReader;
import java.util.Scanner;
import java.util.Stack;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 번호표 사람수
    int N = Integer.parseInt(br.readLine());



    // 간식 번호
        int snack_num = 1;
        String result = "Nice";
        String arr[] = br.readLine().split(" ");
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++){
            int currentNum = Integer.parseInt(arr[i]);
            if(snack_num!=currentNum){
                if(!stack.isEmpty() && snack_num == stack.peek()){
                    snack_num++;
                    i--;
                    stack.pop();
                }
                else{
                    stack.push(currentNum);
                }
            }
            else{
                snack_num++;
            }
        }

        while(!stack.isEmpty()){
            int pop = stack.pop();
            if(pop == snack_num){
                snack_num++;
            }
            else{
                result ="Sad";
                break;
            }
        }
        System.out.println(result);
    }

}