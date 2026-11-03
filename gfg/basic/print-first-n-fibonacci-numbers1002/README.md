# First n Fibonacci using Recursion

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number  **n**, return an array containing the first n Fibonacci numbers.

- The first two Fibonacci numbers are 0 and 1. 
- Each subsequent Fibonacci number is obtained by adding the previous two numbers.

 **Examples:** 

```
Input: n = 5
Output: [0, 1, 1, 2, 3]
Explanation: The first 5 Fibonacci numbers are 0, 1, 1, 2, 3.

```

```
Input: n = 7
Output: [0, 1, 1, 2, 3, 5, 8]
Explanation: The first 7 Fibonacci numbers are 0, 1, 1, 2, 3, 5, 8.
```

```
Input: n = 2
Output: [0, 1]
Explanation: The first 2 Fibonacci numbers are 0 and 1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T04:44:52.013Z  

```java
class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(fibonacci(i));
        }
        return ans;
    }
    int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1)