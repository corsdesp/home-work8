package com.epam.training.app;

public class App {
    public static void main(String[] args) {
        if (checkArgs(args)) {
            FileUtils.convert(args[0], args[1]);
        }
    }

    private static boolean checkArgs(String[] args) {
        if (args.length > 2) {
            Informator.manyArguments();
            return false;
        }
        if (args.length < 2) {
            Informator.fewArguments();
            return false;
        }
        return true;
    }
}
