function solution(numbers) {
    var answer = 0;
    var temp = 0;
    
    for (i = 0; i < numbers.length; i++) {
        temp += numbers[i];
    }
    
    answer = temp / numbers.length;
    return answer;
}