import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<String> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push("(");
            } else {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        
        if(!stack.isEmpty()) return false;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
}