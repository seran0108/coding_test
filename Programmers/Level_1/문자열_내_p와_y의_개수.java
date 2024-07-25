class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        
        for (char i : s.toCharArray()){
            if(Character.toUpperCase(i) == 'P')
                p++;
            else if(Character.toUpperCase(i) == 'Y')
                y++;                        
        }
        
        answer = p == y ? true : false; 
        return p==0 && y==0 ? true : answer ;
    }
}