import java.util.Stack;

public class CalculateStockSpans {


    public int[] calculateSpans(int[] prices){
        int[] spans = new int[prices.length];
        spans[0]=1;
        Stack<Integer> indexStack = new Stack<>();
        indexStack.push(0);

        for(int i=1;i<prices.length;i++){
            while(!indexStack.isEmpty() && prices[indexStack.peek()]<= prices[i]){
                indexStack.pop();
            }
            if(indexStack.isEmpty()){
                spans[i] = i+1;
            }else{
                spans[i] = i -indexStack.peek();
            }
            indexStack.push(i);



        }
        return spans;
    }
    
}
