package com.ex6;

public class UnknownDocument extends Document {
    @Override
    public void print() {
        System.out.println("Unknown format");
    }
}
