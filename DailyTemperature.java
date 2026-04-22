import java.util.Stack;

public class DailyTemperature {

    public int[] dailyTemperatures(int[] temp){


        Stack<Integer> helperStack = new Stack<>();
        int n = temp.length;
        int[] result =new int[n];

        for(int i=n-1;i>=0;i--){

            while(!helperStack.isEmpty() && temp[i]>= temp[helperStack.peek()]){
                helperStack.pop();
            }

            if(!helperStack.isEmpty()){
                result[i] = helperStack.peek() - i;
            }
            helperStack.push(i);
        }
        return result;
    }
    
}
