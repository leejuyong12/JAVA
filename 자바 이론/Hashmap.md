HashMap



```

import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("0", "a");
        map.put("1", "b");
         map.put("2", "c");
         map.put("3", "d");
         map.put("4", "e");
         map.put("5", "f");
         map.put("6", "g");
         map.put("7", "h");
         map.put("8", "i");
         map.put("9", "j");
         
        // age 를 string 문자형으로 나누고 map의 key 값이랑 비교해서 value를 가져오기
        String tmp = String.valueOf(age);
        
        //for 반복문으로 돌면서 
        for(int i=0;i<tmp.length();i++){
           
            answer += map.get(String.valueOf(tmp.charAt(i)));
            
        }

         return answer;
        
    }
}
```

```

정리


String
Character
Integer

HashMap<String, String> map = new HashMap<String, String>();

해시맵에 값을 넣으려면 put 가져오려면 get

String -> int

Integer.parseInt( 값 )
Integer.valueOf( 값 )

int -> String

Integer.toString( 값 )
String.valueOf( 값 )
```

