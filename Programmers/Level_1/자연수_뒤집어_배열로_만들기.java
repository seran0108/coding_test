import java.util.*;

class Solution {
    public int[] solution(long n) {
        String[] temp = Long.toString(n).split("");
        List<Integer> list = new ArrayList<>();
        
      
        for(int i=temp.length-1; i>=0; i--){
            list.add(Integer.parseInt(temp[i])); 
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}