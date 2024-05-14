function solution(n, k) {
    var answer = 0;
    
    var sheep = parseInt(12000);
    var drink = parseInt(2000);
    
    answer = sheep * n + (k - Math.floor(n / 10)) * drink;
    
    return answer;
}