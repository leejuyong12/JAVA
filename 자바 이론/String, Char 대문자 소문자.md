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