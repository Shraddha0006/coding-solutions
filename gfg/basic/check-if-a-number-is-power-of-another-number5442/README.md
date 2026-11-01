# Check for Power

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two positive integers  **x**  and **y**, determine if y is a power of x. If y is a power of x, return  **true**. Otherwise, return  **false**.

 **Examples:** 

```
Input: x = 2, y = 8
Output: true 
Explanation: 23 is equal to 8.
```

```
Input: x = 1, y = 8
Output: false
Explanation: Any power of 1 is not equal to 8.
```

```
Input: x = 46, y = 205962976
Output: true
Explanation: 465 is equal to 205962976.
```

```
Input: x = 50, y = 312500000
Output: true
Explanation: 505 is equal to 312500000.
```

**Constraints:
**1 ≤ x ≤ 103
1 ≤ y ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T15:04:36.196Z  

```java
class Solution {
    public boolean isPower(int x, int y) {
        // code here first method
        // if(x ==1){
        //     return y == 1;
        // }
        // long pow = 1;
        // while(pow < y){
        //     pow *= x;
        // }
        // return pow == y;
        //
        
        
        
        //Second method 
        // if(y==1){
        //     return true;
        // }
        // if(x==1){
        //     return false;
        // }
        // while(y%x==0){
        //     y/=x;
        // }
        // return y== 1;
        
        
        //third method
        if(y==1){
            return true;
        }
        if(x==1){
            return false;
        }
        //double res = Math.log(y)/Math.log(x);
        double res = Math.log(y)/Math.log(x);
        return Math.abs(res-Math.round(res))<1e-10;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-a-number-is-power-of-another-number5442/1)