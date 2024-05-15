import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int k = 0;
        
        Arrays.sort(array);
        
        k = array.length/2;
        
        answer = array[k];
        return answer;
    }
}