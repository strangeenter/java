package com.mao.homework.day05;

import com.mao.homework.month10.day05.Cat;
import com.mao.homework.month10.day05.Dog;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void dogTest(){
        Dog dog = new Dog();
        dog.cry();
    }

    @Test
    public void catTest(){
        Cat cat = new Cat();
        cat.cry();
    }
}
