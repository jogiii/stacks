import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void push(int x){
       s1.push(x);
        
    }

    public int pop(){
        transfer();
        return s2.pop();
    }

    public int peek(){
        transfer();
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }


    private void transfer(){
        if (s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println("Peek: " + queue.peek());   // Expected: 1
        System.out.println("Pop: " + queue.pop());     // Expected: 1
        System.out.println("Pop: " + queue.pop());     // Expected: 2
        queue.push(4);
        System.out.println("Peek: " + queue.peek());   // Expected: 3
        System.out.println("Pop: " + queue.pop());     // Expected: 3
        System.out.println("Pop: " + queue.pop());     // Expected: 4
        System.out.println("Empty: " + queue.empty()); // Expected: true
    }
    
}
