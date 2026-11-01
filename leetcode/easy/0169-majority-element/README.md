# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of size `n`, return  *the majority element*.

The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: 3

```

 **Example 2:** 

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 5 * 104
- -109 <= nums[i] <= 109
- The input is generated such that a majority element will exist in the array.

 

 **Follow-up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 84.69%)  
**Memory:** 62.8 MB (beats 48.33%)  
**Submitted:** 2026-11-01T14:52:55.439Z  

```java
class Solution {
    public int majorityElement(int[] nums) {
        int candidate= nums[0];
        int count= 0;
        for(int num: nums){
            if(count == 0){
                candidate =num;
            }
            if(num == candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;


        //----------------------------second method----
        // int n=nums.length;
        // Arrays.sort(nums);//time complexity 0(nlogn)------sort function ke liye
        // return nums [n/2];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element/)