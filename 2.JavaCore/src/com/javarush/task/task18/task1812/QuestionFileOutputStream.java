package com.javarush.task.task18.task1812;

/*
Расширяем AmigoOutputStream
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream origin;

    public QuestionFileOutputStream(AmigoOutputStream origin) {
        this.origin = origin;
    }

    @Override
    public void flush() throws IOException {
        origin.flush();
    }

    @Override
    public void write(int b) throws IOException {
        origin.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        origin.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        origin.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (reader.readLine().equals("Д"))
            origin.close();
    }
}

