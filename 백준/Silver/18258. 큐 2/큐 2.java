import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    //
    int N = Integer.parseInt(br.readLine());

    //
    Queue<Integer> queue = new LinkedList<>();
    int last = -1;
    for(int i = 0; i < N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        switch(s){
            case "push" :
                int num = Integer.parseInt(st.nextToken());
                queue.offer(num);
                last = num; // 마지막 값 기억
                break;
            case "pop" :
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(queue.poll()).append("\n");
                }
                break;
            case "size" :
                sb.append(queue.size()).append("\n");
                break;
            case "empty" :
                sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                break;
            case "front" :
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else{
                    sb.append(queue.peek()).append("\n");
                }
                break;
            case "back" :
                sb.append(queue.isEmpty() ? -1 : last).append("\n");
                break;

        }

    }
        System.out.println(sb);
    }

}