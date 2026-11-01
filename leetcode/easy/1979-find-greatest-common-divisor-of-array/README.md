# Find Greatest Common Divisor of Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, return  *the  **greatest common divisor**  of the smallest number and largest number in* `nums`.

The  **greatest common divisor**  of two numbers is the largest positive integer that evenly divides both numbers.

 

 **Example 1:** 

```
Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.

```

 **Example 2:** 

```
Input: nums = [7,5,6,8,3]
Output: 1
Explanation:
The smallest number in nums is 3.
The largest number in nums is 8.
The greatest common divisor of 3 and 8 is 1.

```

 **Example 3:** 

```
Input: nums = [3,3]
Output: 3
Explanation:
The smallest number in nums is 3.
The largest number in nums is 3.
The greatest common divisor of 3 and 3 is 3.

```

 

 **Constraints:** 

- 2 <= nums.length <= 1000
- 1 <= nums[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.7 MB (beats 84.30%)  
**Submitted:** 2026-11-01T14:52:36.124Z  

```java
class Solution {
    public int findGCD(int[] nums) {
        int mini=nums[0];
        int maxi=nums[0];
        for(int e1 : nums){
            if(e1<mini)
                mini=e1;
            else if(e1>maxi)
                maxi=e1;
        }

            int a=maxi,b=mini;

            
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            return a;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-greatest-common-divisor-of-array/)