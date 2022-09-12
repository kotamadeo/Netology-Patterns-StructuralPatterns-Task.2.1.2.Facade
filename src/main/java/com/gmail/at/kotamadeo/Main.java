package com.gmail.at.kotamadeo;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("0010", "0100"));
        System.out.println(bins.mult("0010", "0100"));
    }
}