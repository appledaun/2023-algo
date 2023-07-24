import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        
        while(pq.size() > 1 && pq.peek() < K) {
            answer++;
            int first = pq.poll().intValue();
            int second = pq.poll().intValue();
            
            pq.add(first + (second * 2));
        }
        
        if(pq.peek() < K) {
            return -1;
        }
        
        return answer;
    }
}