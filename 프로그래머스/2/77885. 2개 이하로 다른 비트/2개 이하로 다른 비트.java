class Solution {
   public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long x = numbers[i];
            answer[i] = getBits(x);
        }
        return answer;
    }

    public static long getBits(long x){
        if (x % 2 == 0) {
            return x + 1;
        }

        String binary = Long.toBinaryString(x);

    
    int zeroIndex = binary.lastIndexOf("0");

    
    if (zeroIndex == -1) {
        String newBinary = "10" + binary.substring(1);

        return Long.parseLong(newBinary, 2);
    } else {
        StringBuilder sb = new StringBuilder(binary);
        sb.setCharAt(zeroIndex, '1');
        sb.setCharAt(zeroIndex + 1, '0');

        return Long.parseLong(sb.toString(), 2);
    }
    }
}