class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        int num = 0;
    
        for (int i = 1; i <= cipher.length(); i++) {
            num = code * i - 1;
            if (num >= cipher.length()) {
                break;
            }
            answer += cipher.charAt(num);
            // answer += cipher[num].toString;
    }
    
        
        return answer;
    }
}