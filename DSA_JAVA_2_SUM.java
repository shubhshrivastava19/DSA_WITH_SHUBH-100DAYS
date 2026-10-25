// You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]
 

// Constraints:

// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.
 

// Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
import java.util.*;
class DSA_JAVA_2_SUM{
    public static void main(String[]args){  
        // two sum problem :- 
        // 2 pointer approach :- 

        // given array for example :- nums = [2,7,11,15] , and target = 9

        int [] nums = {3,2,4} ;
        int target = 6;
        int [] result = checkFor2Sum2Pointer(target,nums);
        System.out.println("here is the answer");
        System.out.println(Arrays.toString(result));
    }
    public static int[] checkFor2Sum2Pointer(int target, int []nums){
        // int p1 = 0 ; // pointer 1
        // int p2 = p1+1 ; // pointer 2
        for(int i = 0; i<nums.length ; i++){// outer loop for looping the array
            for(int j = i+1; j<nums.length; j++){// inner loop for creating combinations with p1 objects
                int sum = 0;
                sum = nums[i]+nums[j];
                if(sum==target){
                    return  new  int []{i,j};
                }
            }
        }
        // case when there is no match
        return  new int[]{};
    }
}