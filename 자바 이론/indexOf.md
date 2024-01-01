만약에 배열에서 어떤 값이 있는지 확인하고 싶을때 indexOf를 활용하자



예를 들어



```java
spell = ["a", "b", "c"];

dic = ["abc", "dqw", "csy"];

// dic에 있는 값들중 spell 에 있는 원소가 포함되어있는 단어가 있다면 1 아니면 2를 반환하는 문제가 있다고 한다면(다른 조건 생각안하고 그냥 단순히 이 문제만 봤을때)

다른 코드 생략
for(int i=0;i<dic.length;i++){
	for(int j=0;j<spell.length;j++){
        if(dic[i].indexOf(spell[j]) == -1){ // 이런식으로 indexOf 로 그 원소의 위치가 있다면 -1 이상의 값(그 원소의 자리 index)이 나오고 만약에 없다면 -1 을 반환
             return 2;
        }else
    }
}



```

