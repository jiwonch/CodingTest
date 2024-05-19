class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] array = my_string.replaceAll("[^0-9]", "").split("");
        
        for (int i = 0; i < array.length; i++) {
            answer += Integer.parseInt(array[i]);
        }
        return answer;
    }
}