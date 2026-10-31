# Palindrome Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `x`, return `true` if `x` is a  **palindrome**, and `false` otherwise.

 

 **Example 1:** 

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

```

 **Example 2:** 

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

```

 **Example 3:** 

```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

```

 

 **Constraints:** 

- -231 <= x <= 231 - 1

 

 **Follow up:**  Could you solve it without converting the integer to a string?

## Solution

**Language:** Java  
**Runtime:** 14 ms (beats 20.45%)  
**Memory:** 45.1 MB (beats 98.29%)  
**Submitted:** 2026-10-31T04:27:19.958Z  

```java
class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int rev = 0;
        if(x<0){
            return false;
        }
        while(x>0){
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        if(rev == n){
            return true;
        }else{
            return false;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-number/)