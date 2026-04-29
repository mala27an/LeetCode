import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        //Sort based on start value
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        //Create list to store merged intervals
        List<int[]> list = new ArrayList<>();

        //Take first interval
        int[] current = intervals[0];
        list.add(current);

        //Compare all remaining intervals
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

        //Convert list to array
        return list.toArray(new int[list.size()][]);
    }
}
