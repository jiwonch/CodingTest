class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for (int i = 0; i < rsp.length(); i++) {
            char num = rsp.charAt(i);
            if (num == '2') {
                answer += "0";
            } else if (num == '0') {
                answer += "5";
            } else if (num == '5') {
                answer += "2";
            }
        }
        return answer;
    }
}