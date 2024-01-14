```java
import java.util.*;

class Solution {
    public int solution(String before, String after) {
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        if (Arrays.toString(beforeArr).equals(Arrays.toString(afterArr))) {
            return 1;
        } else {
            return 0;
        }
    }
}

```



```java
import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int result = 1;
        char[] tmp = before.toCharArray();
        char[] tmp2 = after.toCharArray();
        Arrays.sort(tmp);
        Arrays.sort(tmp2);
        String x = new String(tmp);
        String y = new String(tmp2);
        if(x.equals(y)){
            return 1;
        }else{
            return 0;
        }

    }
}
```





* 추가

  Arrays.toString() 도 있고 Character.toString() 도 있다.