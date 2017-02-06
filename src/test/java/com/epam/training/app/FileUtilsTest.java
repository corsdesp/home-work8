package com.epam.training.app;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileUtilsTest {
    @Test
    public void convertTest() throws Exception {
        String inFileName = "./src/main/resources/in.txt";
        String outFileName = "./src/main/resources/out.txt";
        String resultFileName = "./src/main/resources/result.txt";

        FileUtils.convert(inFileName, outFileName);

        String outText = backTextFromFile(outFileName);
        String resultText = backTextFromFile(resultFileName);

        Assert.assertTrue(outText.equals(resultText));

    }

    private String backTextFromFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "cp1251"))) {
            while (reader.ready()) {
                stringBuilder.append(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
