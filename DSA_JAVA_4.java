
// 347. Top K Frequent ElementsGiven an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
// Example 1:
// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
import java.util.*;
class DSA_JAVA_4{
    public static void main(String[]args){
        int [] nums = {1,1,1,2,2,3,3,3,3};
        int k = 2 ;
       System.out.println(KfrequentElement(nums,k));
    // KfrequentElement(nums,k);
    }
    public static int [] KfrequentElement(int [] nums , int k){
        // need to first count the number of frequency of every ele
        // then sort it in increasing order 

        int [] result = new int[k];

        HashMap <Integer,Integer> map = new HashMap<>();
        //count the freq of every element :- 

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        // sort the map
        ArrayList <HashMap.Entry<Integer,Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort((a,b) -> b.getValue() - a.getValue());    
        for (int i = 0; i < k; i++) {
            result[i] = sortedList.get(i).getKey();
        }
        return result ;
    }
}