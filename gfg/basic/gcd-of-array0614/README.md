# GCD of Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array of n positive integers, find the GCD of all the array elements.

 **Example :** 

```
Input: n = 3, arr = [1, 2, 3]
Output: 1
Explanation: GCD of 1,2,3 is 1.
```

```
Input: n = 4, arr = [2, 4, 6, 8]
Output: 2
Explanation: Greatest common divisor of all the numbers is 2.
```

 **Constraints:** 
1 ≤ N, arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T15:04:22.010Z  

```java
class Solution {
    public int gcd(int n, int arr[]) {
        int gcd=arr[0];
        // code here.
        //Arrays.sort(arr);
        for(int i=1;i<n;i++){
            int a=gcd;
            int b=arr[i];
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            gcd=a;
        }
        return gcd;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/gcd-of-array0614/1)