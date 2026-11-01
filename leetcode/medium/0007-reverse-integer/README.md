# Reverse Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a signed 32-bit integer `x`, return `x` *with its digits reversed*. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-231, 231 - 1]`, then return `0`.

 **Assume the environment does not allow you to store 64-bit integers (signed or unsigned).** 

 

 **Example 1:** 

```
Input: x = 123
Output: 321

```

 **Example 2:** 

```
Input: x = -123
Output: -321

```

 **Example 3:** 

```
Input: x = 120
Output: 21

```

 

 **Constraints:** 

- -231 <= x <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41 MB  
**Submitted:** 2026-11-01T14:40:15.136Z  

```java
class Solution {
    public int reverse(int x) {
        //long y=Math.abs(x);
        long y=x;
        long rev=0;
        while(y>0){
            long rem=y%10;
            rev=rev*10+rem;
            y=y/10;
        }
        if(y<0){
            while(y<0){
                long rem=y%10;
                rev=rev*10+rem;
                y=y/10;
            }
        }
        return (int)rev;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-integer/)