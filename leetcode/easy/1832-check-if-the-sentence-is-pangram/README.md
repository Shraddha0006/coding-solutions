# Check if the Sentence Is Pangram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A  **pangram**  is a sentence where every letter of the English alphabet appears at least once.

Given a string `sentence` containing only lowercase English letters, return `true` *if* `sentence` *is a  **pangram**, or* `false` *otherwise.* 

 

 **Example 1:** 

```
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

```

 **Example 2:** 

```
Input: sentence = "leetcode"
Output: false

```

 

 **Constraints:** 

- 1 <= sentence.length <= 1000
- sentence consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 29.55%)  
**Memory:** 42.4 MB (beats 88.03%)  
**Submitted:** 2026-11-01T14:55:57.315Z  

```java
class Solution {
    public boolean checkIfPangram(String sentence) {
        // if(sentence.length()<26)return false;
        // for(char ch='a';ch<='z';ch++){
        //     if(sentence.indexOf(ch)<0){
        //         return false;
        //     }
        // }
        // return true;

        boolean[] arr=new boolean[26];
        int count=0;
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(arr[ch-'a']==false)
            count++;
            arr[ch-'a']=true;
        }
        return count==26;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)