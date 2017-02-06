package com.epam.training.app;

public class Informator {
    private static Printer printer = new ConsolePrinter();

    public static void convertError() {
        printer.print("Ошибка при конвертации");
    }

    public static void fewArguments() {
        printer.print("Мало агрументов");
    }

    public static void manyArguments() {
        printer.print("Много агрументов");
    }
}
