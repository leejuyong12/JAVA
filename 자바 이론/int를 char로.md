char를 int로 바꾸는 방법 세가지



1.

```
int value = 1;

char value_char = (char)(value + '0');

이 방법은 굳이?
```



2.

```
int radix = 10; // 10진수
int value = 1;	// 바꾸고자 하는 숫자

char value_char = Character.forDigit(value, radix);
```



3.

```
int value = 1;
char value_char = Integer.toString(value).charAt(0);

int에서 String으로 변경하고 다시 char로 변경 
```

