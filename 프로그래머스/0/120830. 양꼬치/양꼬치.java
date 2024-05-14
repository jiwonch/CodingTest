class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int sheep = 12000;
        int drink = 2000;

        if (n % 10 == 0) {
            System.out.println(n/10);
            answer = sheep*n + (k - (n / 10)) * drink;
        } else {
            answer = sheep * n + drink * k;
        }
    
        return answer;
    }
}