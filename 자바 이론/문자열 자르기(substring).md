```java
프로그래머스 - 잘라서 배열로 저장하기


class Solution {
    public String[] solution(String my_str, int n) {
        int cnt = 0;
        if( my_str.length() % n == 0){
            cnt = my_str.length() / n;
        }else{
            cnt = (my_str.length() / n) + 1;
        }
        String[] result = new String[cnt];
        for(int i=0;i<cnt;i++){
            if(my_str.length() >= n){
                result[i] = my_str.substring(0, n);
                my_str = my_str.substring(n, my_str.length());
            }else{
                result[i] = my_str.substring(0, my_str.length());
            }
        }
        return result;
    }
}


```



문자열을 잘라서 새로 만들고 잘라서 새로 만들고



substring(시작, 끝)