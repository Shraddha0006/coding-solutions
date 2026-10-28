# Sort Colors

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array `nums` with `n` objects colored red, white, or blue, sort them  **in-place** so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

 **Example 1:** 

 **Input:**  nums = [2,0,2,1,1,0]

 **Output:**  [0,0,1,1,2,2]

 **Explanation:** 

The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s first, then all 1s, then all 2s.

 **Example 2:** 

 **Input:**  nums = [2,0,1]

 **Output:**  [0,1,2]

 **Explanation:** 

The array has one each of 0, 1, and 2, arranged in-place in the order 0, 1, 2.

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 300
- nums[i] is either 0, 1, or 2.

 

 **Follow up:**  Could you come up with a one-pass algorithm using only constant extra space?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.1 MB (beats 88.38%)  
**Submitted:** 2026-10-28T10:08:29.358Z  

```java
class Solution {
    public void sortColors(int[] nums) {
        /*
        approach 1st ----------------------sort;
        Arrays.sort(nums);
        */
        /*
        approach 2nd------------------------count0.count 1.count2----
        */
        // int count_0=0;
        // int count_1=0;
        // int count_2=0;
        // for(int i =0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         count_0++;
        //     }
        //     else if(nums[i]==1){
        //         count_1++;
        //     }
        //     else{
        //         count_2++;
        //     }
        // }
        // int index=0;
        // while(count_0>0){
        //     nums[index]=0;
        //     index++;
        //     count_0--;
        // }
        // while(count_1>0){
        //     nums[index]=1;
        //     index++;
        //     count_1--;
        // }
        // while(count_2>0){
        //     nums[index]=2;
        //     index++;
        //     count_2--;
        // }
        

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }

            else if (nums[mid] == 1) {
                mid++;
            }

            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-colors/)