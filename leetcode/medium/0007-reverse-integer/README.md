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
**Submitted:** 2026-11-01T14:49:58.091Z  

```java
class Solution {
    public int reverse(int x) {

        int rev = 0;

        while (x != 0) {

            int rem = x % 10;
            x = x / 10;

            // Check overflow
            if (rev > Integer.MAX_VALUE / 10 ||
               (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
               (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }

            rev = rev * 10 + rem;
        }

        return rev;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-integer/)