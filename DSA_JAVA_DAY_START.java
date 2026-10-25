// problem statment : - given a array of length 'n' we need to find the max subarray sum
// write code in all the approaches and also find its time complexity
// leet code problem link :- https://leetcode.com/problems/maximum-subarray/description/

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
// Example 2:

// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.
// Example 3:

// Input: nums = [5,4,-1,7,8]
// Output: 23
// Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.


class DSA_JAVA_DAY_START{
    public static void main(String[]args){
        int [] arr = {1,2,3,4,5};
        int [] returnValue = MaxSumOfSubarrayMethod1(arr);
        System.out.print(returnValue);
    }
    // method or approach 1 for getting the max sum of subarray 
    static int [] MaxSumOfSubarrayMethod1(int [] arr){
        System.out.print(arr);
        return new int[]{};
    }
}