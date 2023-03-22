package com.demo;

import java.util.Scanner;

public class PersonDemo {
    public Integer value;

    PersonDemo(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
