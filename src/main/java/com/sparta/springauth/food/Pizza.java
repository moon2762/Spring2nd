package com.sparta.springauth.food;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pizza") // 사용하는곳에도 똑같이 있어야 하며 지역적으로 사용할때 유리
public class Pizza implements Food {
    @Override
    public void eat() {
        System.out.println("피자를 먹습니다.");
    }
}