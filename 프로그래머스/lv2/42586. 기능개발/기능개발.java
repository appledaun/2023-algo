import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i = 0; i < progresses.length; i++) {
            int n = 100 - progresses[i];
            int day = 1;
            while(n > speeds[i]) {
                day++;
                n -= speeds[i];
            }
            queue.add(day);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        int count = 1;
        int pub = queue.poll().intValue();

        while(!queue.isEmpty()) {         
            if(pub >= queue.peek().intValue()) {
                count++;
                queue.poll();
            } else {
                pub = queue.poll().intValue();
                result.add(count);
                count = 1;
            }
        }
        result.add(count);
        
        answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        } 
        return answer;
    }
}