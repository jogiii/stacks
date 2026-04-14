import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {


    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();


    public void push(int x){
        q2.offer(x);

        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }

        Queue<Integer> temp = q1;
        q1=q2;
        q2=temp;
    }


    public void pushV2(int x){
        q1.offer(x);

        // rotate elements
        for(int i=0;i<q1.size()-1;i++){
            q1.offer(q1.poll());
        }
    }



    public int pop(){
        return q1.poll();
    }

    public int top(){
        return q1.peek();
    }
    public boolean empty() {
        return q1.isEmpty();
    }


    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.pushV2(1);
        stack.pushV2(2);
        stack.pushV2(3);
        stack.pushV2(4);

        System.out.println("Top: " + stack.top());       // Expected: 4
        System.out.println("Pop: " + stack.pop());       // Expected: 4
        System.out.println("Pop: " + stack.pop());       // Expected: 3
        System.out.println("Top: " + stack.top());       // Expected: 2
        System.out.println("Empty: " + stack.empty());   // Expected: false
        stack.pop();
        stack.pop();
        System.out.println("Empty: " + stack.empty());   // Expected: true
    }
    
}
