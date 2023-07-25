import java.util.*;

class Solution {
    
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] arr = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            arr[i] = "" + numbers[i];
        }
        
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.parseInt(b + a) - Integer.parseInt(a + b);
            }
        });
        
        if(arr[0].equals("0")) return "0";
        
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        
        
        return answer;
    }
}