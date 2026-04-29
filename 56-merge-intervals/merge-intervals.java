import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort based on start value
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Step 2: Create list to store merged intervals
        List<int[]> list = new ArrayList<>();

        // Step 3: Take first interval
        int[] current = intervals[0];
        list.add(current);

        // Step 4: Compare all remaining intervals
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            // If overlap
            if (next[0] <= current[1]) {
                current[1] = Math.max(current[1], next[1]);
            } 
            // If no overlap
            else {
                current = next;
                list.add(current);
            }
        }

        // Step 5: Convert list to array
        return list.toArray(new int[list.size()][]);
    }
}
