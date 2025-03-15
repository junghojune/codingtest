import java.util.*;

class Solution {
    public static int[] solution(int[] fees, String[] records) {
        Map<String, Integer> parking = new HashMap<>();
        Map<String, Integer> totalFee = new TreeMap<>();
        int[] answer = {};

        int basicTime = fees[0];
        int basicFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        // 출차 된 차량
        for(String record : records) {
            String[] recordSplit = record.split(" ");
            int time = getTime(recordSplit[0]);
            String carNumber = recordSplit[1];
            if(recordSplit[2].equals("IN")){
                parking.put(carNumber, time);
            } else {
                if(!totalFee.containsKey(carNumber)) {
                    totalFee.put(carNumber, time - parking.get(carNumber));
                } else {
                    totalFee.put(carNumber, totalFee.get(carNumber) + time - parking.get(carNumber));
                }

                parking.remove(carNumber);
            }
        }

        // 출입 + 출차는 안된 차량
        if (!parking.isEmpty()) {
            for(String carNumber : parking.keySet()) {
                Integer fee = totalFee.get(carNumber) == null ? 0 : totalFee.get(carNumber);
                totalFee.put(carNumber, fee + 1439 - parking.get(carNumber));
            }
        }

        List<Integer> list = new ArrayList<>();
        for(Integer time : totalFee.values()) {
            if(time <= basicTime) {
                list.add(basicFee);
            } else {
                // 기본 시간 외 추가로 주차한 시간
                int addTime = time - basicTime;
                // 요금이 부과되는 시간
                double unitTimeFee = Math.ceil((double) addTime / unitTime) ;
                int fee = (int) unitTimeFee * unitFee;
                list.add(fee + basicFee);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int getTime(String time){
        String[] timeSplit = time.split(":");

        int hour = Integer.parseInt(timeSplit[0]);
        int minute = Integer.parseInt(timeSplit[1]);

        return hour * 60 + minute;
    }
}