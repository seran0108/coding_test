class Solution {
    public long solution(long n) {
        long answer = 0;
        
        char[] list = Long.toString(n).toCharArray();
        
        for(int i = 0; i < list.length ; i++){
            for(int j = 0; j < list.length ; j++){
                
                if(list[j] < list[i]){
                    char temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                    
                }
            }
        }//end for
        
        answer = Long.valueOf(String.valueOf(list));
        
        return answer;
    }
}