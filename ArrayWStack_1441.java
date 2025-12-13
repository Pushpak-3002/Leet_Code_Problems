import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> buildArray(int[] target, int n) {
        int c=1;
        int i=0;
        List<String> stack = new ArrayList<>();
        System.out.println(target.length);
        while(c<=target[target.length-1]){
            if(c==target[i]){
                stack.add("Push");
                i++;
            }else{
                stack.add("Push");
                stack.add("Pop");
            }
            c++;
        }
        return stack;
    }
}