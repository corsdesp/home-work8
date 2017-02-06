package com.epam.training.app;

import java.io.*;

public final class FileUtils {
    private static final String IN_ENCODE = "UTF-16";
    private static final String OUT_ENCODE = "cp1251";

    public static void convert(String inFileName, String outFileName) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inFileName), IN_ENCODE));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFileName), OUT_ENCODE))) {

            while (reader.ready()) {
                writer.write(reader.readLine());
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            Informator.convertError();
        }
    }
}
