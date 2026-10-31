# Most Frequent Character

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s** of lowercase alphabets. The task is to find the maximum occurring character in the string  **s**. If more than one character occurs the maximum number of times then print the lexicographically smaller character.

 **Examples:** 

```
Input: s = "testsample"
Output: 'e'
Explanation: 'e' is the character which is having the highest frequency.
```

```
Input: s = "output"
Output: 't'
Explanation: 't' and 'u' are the characters with the same frequency, but 't' is lexicographically smaller.
```

 **Constraints:** 
1 ≤ |s| ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T10:05:54.223Z  

```java
class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        // int [] arr=new int[26];
        // for(int i=0;i<s.length();i++){
        //     arr[s.charAt(i)- 'a']++;
        // }
        // int maxfreq=0;
        // char result='a';
        // for(int i=0;i<26;i++){
        //     if(arr[i]>maxfreq){
        //         maxfreq=arr[i];
        //         result=(char) ('a'+i);
        //     }
        // }
        // return result;
        
        int [] freq=new int[26];
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        int maxi=freq[0];
        char ch='a';
        
        for(int i=1;i<26;i++){
            if(freq[i]>maxi){
                maxi=freq[i];
                ch=(char)('a'+i);
            }
        }
        return ch;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1)