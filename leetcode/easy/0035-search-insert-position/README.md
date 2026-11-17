# Search Insert Position

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,3,5,6], target = 5
Output: 2

```

 **Example 2:** 

```
Input: nums = [1,3,5,6], target = 2
Output: 1

```

 **Example 3:** 

```
Input: nums = [1,3,5,6], target = 7
Output: 4

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -104 <= nums[i] <= 104
- nums contains distinct values sorted in ascending order.
- -104 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41.7 MB  
**Submitted:** 2026-11-17T08:56:20.756Z  

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int hight=nums.length-1;
        int pos=-1;
        if(nums[0]>target){
            return 0;
        }
        while(low<=hight){
            int mid=low+(hight-low)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                pos=mid+1;
                low=mid+1;
            }
            else if(nums[mid]>target){
                hight=mid-1;
            }
        }
        return pos;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/search-insert-position/)