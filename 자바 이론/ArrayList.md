프로그래머스 - 소인수분해  문제



```java

import java.util.*;

class Solution {
    public ArrayList solution(int n) {		//***int[] 대신 ArrayList사용
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=2;i<=n;i++){
            while(n % i == 0){
                if(!answer.contains(i)){	
                    answer.add(i);
                }
                n /= i;
                
            }
            
        }
        return answer;
    }
}


```

배열관련 

contains

add  