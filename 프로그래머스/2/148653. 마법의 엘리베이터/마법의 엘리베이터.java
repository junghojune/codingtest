class Solution {
    public int solution(int storey) {
        int count = 0;

        while(storey > 0) {
            int digit = storey % 10;
            storey /= 10;

            if (digit > 5) {
                count += (10 - digit);
                storey += 1;
            } else if (digit < 5) {
                count += digit;
            } else {
                if (storey % 10 >= 5) {
                    count += (10 - digit);
                    storey += 1;
                } else {
                    count += digit;
                }
            }
        }
        return count;
    }
}