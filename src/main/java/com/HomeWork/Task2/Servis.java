package com.HomeWork.Task2;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class Servis {
    private final Basket basket;

    public Servis(Basket basket) {
        this.basket = basket;
    }


    public void add(int value) {
        this.basket.add(value);
    }

    public Collection<Integer> get() {
        return this.basket.get();
    }
}

