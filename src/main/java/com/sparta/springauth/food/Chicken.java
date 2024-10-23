package com.sparta.springauth.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // @Qualifier 보다 큰 범위로 사용하며 전역으로 사용한다 둘 다 있을땐 @Qualifier 가 더 우선
public class Chicken implements Food {
    @Override
    public void eat() {
        System.out.println("치킨을 먹습니다.");
    }
}