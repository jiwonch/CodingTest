/**
* @brief 입력한 정수n의 짝수 홀수 구분하는 함수
* @details n이 짝수이면 "n is even" 출력
*          n이 홀수이면 "n is odd" 출력
* @param Integer n
* @return 출력문
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            System.out.printf("%d is even", n);
        } else if (n % 2 != 0) {
            System.out.printf("%d is odd", n);
        }
    }
}