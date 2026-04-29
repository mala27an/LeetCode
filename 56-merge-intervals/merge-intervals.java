import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        //Sort based on first element
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        //Create list to store merged intervals
        List<int[]> l = new ArrayList<>();

        //Take first interval
        int[] present = intervals[0];
        l.add(present);

        //Compare all remaining intervals
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            // If overlap
            if (next[0] <= present[1]) {
                present[1] = Math.max(present[1], next[1]);
            } 
            // If no overlap
            else {
                present = next;
                l.add(present);
            }
        }

        //Convert list to array
        return l.toArray(new int[l.size()][]);
    }
}
