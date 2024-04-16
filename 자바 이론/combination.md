```
class Solution {
    public int solution(int balls, int share) {
        // n! / (n-m)! * m!   n개중 m개 뽑기
        return combination(balls, share);
    }
    public static int combination(int balls, int share){
        if(balls == share || share == 0){
            return 1;
        }else{
            return combination((balls-1), share-1) + combination(balls-1, share);
        }
        
    }
}
```

![img](md-images/image.png)

![스크린샷 2022-08-01 오후 4.37.53.png](md-images/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202022-08-01%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%204.37.53.png)