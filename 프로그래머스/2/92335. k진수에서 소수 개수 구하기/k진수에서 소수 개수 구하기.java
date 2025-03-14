import java.util.Arrays;

class Solution {
    public static int solution(int n, int k) {
        int answer = 0;
        String decimal = Integer.toString(n, k);
        System.out.println(decimal);

        String[] results = Arrays.stream(decimal.split("0"))
                .filter(s -> !s.isEmpty()) // 빈 문자열 제거
                .toArray(String[]::new);

        for(String result : results){
            long checkPrime = Long.parseLong(result);
            if(isPrime(checkPrime) ){
                answer++;
            }
        }

        return answer;
    }

    public static String convertToBase(int n, int k) {

        String result = "";
        while (n > 0){
            int temp = n % k;
            result = temp + result;
            n = n / k;
        }

        return result;
    }

     public static boolean isPrime(long n){
        if(n < 2){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}