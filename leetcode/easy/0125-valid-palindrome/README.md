# Valid Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A phrase is a  **palindrome**  if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` *if it is a  **palindrome**, or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

```

 **Example 2:** 

```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

```

 **Example 3:** 

```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

```

 

 **Constraints:** 

- 1 <= s.length <= 2 * 105
- s consists only of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 44.13%)  
**Memory:** 43.9 MB (beats 93.21%)  
**Submitted:** 2026-10-28T09:41:30.100Z  

```java
class Solution {
    public boolean isPalindrome(String s) {
        // s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        // return new StringBuilder(s).reverse().toString().equals(s);

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z')||(ch>='0' && ch<='9')){
                if(ch>='A' && ch<='Z'){
                    ch=(char)('a'+ch-'A');
                }
                sb.append(ch);
            }
        }
        int start=0;
        int last=sb.length()-1;
        while(start<last){
            if(sb.charAt(start)!=sb.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome/)