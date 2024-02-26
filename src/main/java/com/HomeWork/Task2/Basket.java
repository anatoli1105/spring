package com.HomeWork.Task2;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> numberProduct = new ArrayList();



    public void add(int value) {
        this.numberProduct.addAll(Arrays.asList(value));
    }

    public List<Integer> get() {
        return Collections.unmodifiableList(this.numberProduct);
    }
}
