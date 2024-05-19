function solution(my_string) {
    var answer = 0;
    var array = '';
    
    array = my_string.split("");
        
        for (i = 0; i < array.length; i++) {
            if(Number(array[i])) {
                answer += Number(array[i]);
            }
        }
    return answer;
}