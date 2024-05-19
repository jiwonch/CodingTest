class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int ant1 = 5;
        int ant2 = 3;
        int ant3 = 1;
        
        int hp_1 = hp % ant1;
        
        int ant_num = hp / ant1;
        
        if(hp_1 >= ant2) {
            ant_num += hp_1 / ant2;
            hp_1 = hp_1 % ant2;
            
            if (hp_1 >= ant3) {
                ant_num += hp_1 / ant3;
            }
        } else if (hp_1 >= ant3) {
            ant_num += hp_1 / ant3;
        }
        
        answer = ant_num;
        
        return answer;
    }
}