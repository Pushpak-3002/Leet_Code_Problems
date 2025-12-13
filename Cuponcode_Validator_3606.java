import java.util.*;
class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String, Integer> order = new HashMap<>();
        order.put("electronics", 0);
        order.put("grocery", 1);
        order.put("pharmacy", 2);
        order.put("restaurant", 3);
        List<String[]> valid = new ArrayList<>();
        for (int i = 0; i < code.length; i++) {
            if (code[i] != null && code[i].matches("^[a-zA-Z0-9_]+$") && isActive[i] && order.containsKey(businessLine[i])){
                valid.add(new String[]{businessLine[i], code[i]});
            }
        }
        Collections.sort(valid, (a, b) -> {
            int cmp = order.get(a[0]) - order.get(b[0]);
            if (cmp != 0) return cmp;
            return a[1].compareTo(b[1]);
        });
        List<String> result = new ArrayList<>();
        for (String[] v : valid) {
            result.add(v[1]);
        }
        return result;
    }
}