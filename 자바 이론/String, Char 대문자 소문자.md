### 프로그래머스 대문자와 소문자 문제



// Character.isUpperCase    Character.isLowerCase
// valueOf() -> String 객체로 변환하는 기능
// charAt() -> String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해준다.

// Character.isUpperCase,   Character.isLowerCase  로 대문자인지 소문자인지 판단할 수 있다. 예를 들어,

```java
class Solution {
    public String solution(String my_string) {
        String answer = "";
            for (int i = 0; i < my_string.length(); i++) {
                if (Character.isUpperCase(my_string.charAt(i))) {
                    answer += Character.toLowerCase(my_string.charAt(i));
                } else {
                    answer += Character.toUpperCase(my_string.charAt(i));
                }
            }
        return answer;
    }
}
```



```java
import java.util.*;
// Character.isUpperCase    Character.isLowerCase
// valueOf() -> String 객체로 변환하는 기능
// charAt() -> String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해준다.

class Solution {
    public String solution(String my_string) {
        char tmp;
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            tmp = my_string.charAt(i);    
            if(65 <= tmp && tmp <= 90){
                answer += my_string.valueOf(tmp).toLowerCase();
            }else{
                answer += my_string.valueOf(tmp).toUpperCase();
            }
        }
        return answer;
    }
}
```



그리고 아스키코드로 판단해볼 수 있다.

// a ~ z 97 ~122 	

// A ~ Z 65~90

```java
    System.out.println((int) 'A'); //>> 65
    System.out.println((char) 65); //>> A
```



```java

import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String result = "";
        String[] tmp = my_string.toLowerCase().split("");
        Arrays.sort(tmp);
        for(int i=0;i<tmp.length;i++){
            result += tmp[i];
        }
        return result;
    }
}
```

split 하면서 toLowerCase() 할 수 있다~

```java
import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase(); 
        
        char[] chArr = my_string.toCharArray();
        Arrays.sort(chArr);
        
        String answer = new String(chArr);
        return answer;
    }
}
```

```
  1. my_string을 소문자로 변경한다. ( toLowerCase() )
  2. 변경한 문자열을 char 배열에 각각 넣는다. ( toCharArray() )
  3. 사전 순으로 정렬한다. ( Arrays.sort() )
  4. 정렬한 char 배열을 String 생성자의 인자로 넣어서 문자열로 변환시켜 answer에 저장한다.
```