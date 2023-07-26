class Solution {
    int change = 500;
    
    public boolean isPossible(String s1, String s2) {
        int cnt = 0;
        for(int i = 0; i < s1.length(); i++) {
            if(cnt > 1) return false;
            
            if(s1.charAt(i) != s2.charAt(i)) {
                cnt++;
            }
        }
        if(cnt > 1) return false;
        return true;
    }
    
    public int dfs(int now, String target, String[] words, boolean[] checked, int cnt) {
        if(words[now].equals(target)) {
            //System.out.println("result : " + cnt);
            return cnt;
        }
        
        for(int i = 0; i < words.length; i++) {
            if(!checked[i] && isPossible(words[now], words[i])) {
                //System.out.println(cnt + " : " + words[now] + " " + words[i]);
                checked[i] = true;
                change = Math.min(change, dfs(i, target, words, checked, cnt + 1));
                checked[i] = false;
            }
        }
        
        return change;
    }
    public int solution(String begin, String target, String[] words) {
        int answer = 100;
        
        boolean[] checked = new boolean[words.length];
        
        for(int i = 0; i < words.length; i++) {
            if(isPossible(begin, words[i])) {
                //System.out.println("start : " + words[i]);
                checked[i] = true;
                answer = Math.min(answer, dfs(i, target, words, checked, 1));
                checked[i] = false;
            }
        }
        if(answer == 100) answer = 0;
        return answer;
    }
}