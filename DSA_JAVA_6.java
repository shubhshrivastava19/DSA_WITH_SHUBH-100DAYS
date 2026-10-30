
// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

// Example 1:

// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
// Example 2:

// Input: intervals = [[1,4],[4,5]]
// Output: [[1,5]]
// Explanation: Intervals [1,4] and [4,5] are considered overlapping.
// Example 3:

// Input: intervals = [[4,7],[1,4]]
// Output: [[1,7]]
// Explanation: Intervals [1,4] and [4,7] are considered overlapping.\

// [[1,4],[0,0]] : -  need to sort the array 
import java.util.*;
class DSA_JAVA_6{
    public static void main(String[]args){
        // int [][] interval = {{1,3},{2,6},{8,10},{15,18}};
        // int [][] interval = {{1,4},{0,0}};
        int [][] interval = {{1,4},{2,3}};
        // int [][] ans = merge(interval);
        int [][] ans = sort(interval);

        for(int [] i:ans){
            System.out.print("["+",");
            for(int j:i){
                System.out.print(j+",");
            }
            System.out.print("]"+",");
        }

    }
    public static int [][] sort(int [][] intervals){
     TreeMap<Integer, List<int[]>> sort = new TreeMap<>();

for (int i = 0; i < intervals.length; i++) {
    int sum = intervals[i][0] + intervals[i][1];

    sort.putIfAbsent(sum, new ArrayList<>());
    sort.get(sum).add(intervals[i]);
}

int[][] result = new int[intervals.length][];
int index = 0;

for (List<int[]> list : sort.values()) {
    for (int[] interval : list) {
        result[index++] = interval;
    }
}

return result;
    }
    public static int[][] merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<Integer> unique = new HashSet<>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i-1][1]>intervals[i][0]){

                 ArrayList<Integer> row1 = new ArrayList<>();
                 if(intervals[i-1][0]<intervals[i][0]){
                    row1.add(intervals[i-1][0]);
                 }
                 else{
                    row1.add(intervals[i][0]);
                 }
                 if(intervals[i-1][1]>intervals[i][1]){
                        row1.add(intervals[i-1][1]);
                 }
                 else{
                    row1.add(intervals[i][1]);
                 }
                 unique.add(intervals[i-1][0]);
                 unique.add(intervals[i][1]);
                 result.add(row1);
            }
            else if(intervals[i-1][1]==intervals[i][0]){
                 ArrayList<Integer> row1 = new ArrayList<>();
                 row1.add(intervals[i-1][0]);
                 row1.add(intervals[i][1]);
                 unique.add(intervals[i-1][0]);
                 unique.add(intervals[i][1]);
                 result.add(row1);
                
            }
        }

        for(int i=0;i<intervals.length;i++){
            if(!unique.contains(intervals[i][0]) && !unique.contains(intervals[i][1])){
                ArrayList<Integer> row1 = new ArrayList<>();
                row1.add(intervals[i][0]);
                 row1.add(intervals[i][1]);
                 result.add(row1);
            }
        }

        int[][] array2D = new int[result.size()][];
        
        for (int i = 0; i < result.size(); i++) {
            ArrayList<Integer> row = result.get(i);
            array2D[i] = new int[row.size()];
            for (int j = 0; j < row.size(); j++) {
                array2D[i][j] = row.get(j);
            }
        }
        return array2D;
    }
}