package com.epam.training.app;

public class ConsolePrinter implements Printer{

    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
