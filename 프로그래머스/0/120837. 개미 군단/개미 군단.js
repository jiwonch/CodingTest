function solution(hp) {
    var answer = 0;
    

    var ant1 = 5;
    var ant2 = 3;
    var ant3 = 1;

    var hp_1 = hp % ant1;

    var ant_num = parseInt(hp / ant1);

    if(hp_1 >= ant2) {
        ant_num += parseInt(hp_1 / ant2);
        hp_1 = hp_1 % ant2;

        if (hp_1 >= ant3) {
            ant_num += parseInt(hp_1 / ant3);
        }
    } else if (hp_1 >= ant3) {
        ant_num += parseInt(hp_1 / ant3);
    }

    answer = ant_num;
    
    return answer;
}