import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    Queue<Integer> queue = new LinkedList<>();


    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    sb.append("<");
    // 숫자 큐 삽입
    for(int i = 1; i < N+1; i++){
        queue.offer(i);
    }

    for(int i = 0; i < N-1; i++){
        for(int j = 0; j < K-1; j++){
            queue.offer(queue.poll());
        }
            sb.append(queue.poll()).append(", ");
    }
    sb.append(queue.poll());
    sb.append(">");
    System.out.println(sb);
    }

}