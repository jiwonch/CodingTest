function solution(array) {
    var answer = 0;
    var k = 0;
    array.sort(function(a,b) {
        return a-b;
    })
    
    k = parseInt(array.length / 2);
    
    answer = array[k];
    return answer;
}