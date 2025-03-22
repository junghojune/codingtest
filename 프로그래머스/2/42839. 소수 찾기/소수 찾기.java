
import java.util.*;
class Solution {
    Set<Integer> numberSet = new HashSet<>();

    public int solution(String numbers) {

        dfs("", numbers);

        int count = 0;
        for (int num : numberSet) {
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }


    private void dfs(String prefix, String remain) {
        if (!prefix.equals("")) {
            numberSet.add(Integer.parseInt(prefix));
        }

        for (int i = 0; i < remain.length(); i++) {
            dfs(prefix + remain.charAt(i), remain.substring(0, i) + remain.substring(i + 1));
        }
    }


    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}