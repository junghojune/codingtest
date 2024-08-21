class Solution {
    public String solution(String s) {
         StringBuilder sb = new StringBuilder();


        for(String n : s.split(" ")) {
            if(n.length() == 0) {
                sb.append(" ");
            }
            else {
                sb.append(n.substring(0, 1).toUpperCase()).append(n.substring(1).toLowerCase()).append(" ");
            }
        }

        if(s.substring(s.length() - 1, s.length()).equals(" ")) {
            return sb.toString();
        }

        return sb.toString().substring(0, sb.toString().length() - 1);
    }
    
}