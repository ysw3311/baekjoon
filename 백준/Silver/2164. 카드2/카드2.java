import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    // 카드 장수 입력
    int N = Integer.parseInt(br.readLine());

    //
    Queue<Integer> queue = new LinkedList<>();

    // 큐에 카드(1~N)까지 enque
    for(int i = 0 ; i < N; i++){
        queue.offer(i+1);
    }

    while(queue.size()>1){
        queue.poll();
        queue.offer(queue.poll());
    }
        System.out.println(queue.peek());

    }

}