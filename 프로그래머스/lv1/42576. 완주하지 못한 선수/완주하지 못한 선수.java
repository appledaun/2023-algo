import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant, 0, participant.length);
        Arrays.sort(completion, 0, completion.length);
        
        int i = 0;
        for(i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                break;
            }
        }
        answer = participant[i];
        return answer;
    }
}