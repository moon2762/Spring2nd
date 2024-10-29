package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@Disabled
@SpringBootTest // bean 주입 사용 (di)
public class BeanTest {

    @Autowired // 기본적으로 Food의 타입으로 찾는다 Food에는 두 개의 bean 이 있기 때문에 Autowired(bena 타입으로사용)를 할수 없다 .
    @Qualifier("pizza")
    Food pizza;

    @Autowired
    Food chicken;

    @Test
    @DisplayName("테스트")
    void test1(){

        pizza.eat();
        chicken.eat();
    }
}
