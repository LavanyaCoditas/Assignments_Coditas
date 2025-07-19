package Assignment1;
import java.util.*;
public class NonOverlapIntervals {



        public static void main(String[] args) {
            int[][] intervals = {
                    {1, 3},
                    {2, 6},
                    {8, 10},
                    {15, 18}
            };

            int[][] result = mergeIntervals(intervals);
            for (int[] interval : result) {
                System.out.println(Arrays.toString(interval));
            }
        }

        public static int[][] mergeIntervals(int[][] intervals) {
            List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
            boolean merged;

            do {
                merged = false;
                for (int i = 0; i < list.size(); i++) {
                    for (int j = i + 1; j < list.size(); j++) {
                        int[] a = list.get(i);
                        int[] b = list.get(j);

                        if (a[1] >= b[0] && b[1] >= a[0]) {
                            // Merge intervals
                            int start = Math.min(a[0], b[0]);
                            int end = Math.max(a[1], b[1]);
                            list.set(i, new int[]{start, end});
                            list.remove(j);
                            merged = true;
                            break;
                        }
                    }
                    if (merged) break;
                }
            } while (merged);

            return list.toArray(new int[list.size()][]);
        }
    }


