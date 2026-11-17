# Find First and Last Position of Element in Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

 

Original
Java
 **Example 1:** 

```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

```

 **Example 2:** 

```
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

```

 **Example 3:** 

```
Input: nums = [], target = 0
Output: [-1,-1]

```

 

 **Constraints:** 

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109
- nums is a non-decreasing array.
- -109 <= target <= 109

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 47.8 MB (beats 69.18%)  
**Submitted:** 2026-11-17T09:35:58.321Z  

```java
class Solution{
    int binarySearch(int[] nums,int target,boolean flag){
        int l=0;
        int r=nums.length-1;
        int pos=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target<nums[mid]){
                r=mid-1;
            }   
            else if(target>nums[mid]){
                l=mid+1;
            }
            else{
                pos=mid;
                if(flag==true){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
        }
        return pos;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int left=binarySearch(nums,target,true);
        int right=binarySearch(nums,target,false);

        ans[0]=left;
        ans[1]=right;
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)