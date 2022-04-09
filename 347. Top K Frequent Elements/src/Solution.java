import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.topKFrequent(new int[]{1, 2}, 2)));
    }

    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int value : nums) {
            numberMap.put(value, numberMap.getOrDefault(value, 0) + 1);
        }
        TreeMap<Integer, List<Integer>> freqMap = new TreeMap<>();
        for (int num : numberMap.keySet()) {
            int freq = numberMap.get(num);
            if (!freqMap.containsKey(freq)) {
                freqMap.put(freq, new ArrayList<>());
            }
            freqMap.get(freq).add(num);
        }
        for (int i = 0; i < result.length; i++) {
            Map.Entry<Integer, List<Integer>> entry = freqMap.pollLastEntry();
            for (int j = 0; j < entry.getValue().size(); j++) {
                if (j >= 1) {
                    i++;
                }
                result[i] = entry.getValue().get(j);

            }
        }
        return result;


    }
}
