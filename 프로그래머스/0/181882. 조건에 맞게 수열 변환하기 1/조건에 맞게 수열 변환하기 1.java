/**
* @brief 배열의 원소 값이 50보다 크거나 같은 짝수면 2로 나누고,
* \n 50보다 작은 홀수라면 2를 곱한 배열을 return
* @param Integer Array arr
* @return Interger Array answer
*/


class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i]/2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                answer[i] = arr[i]*2;
            } else {
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}