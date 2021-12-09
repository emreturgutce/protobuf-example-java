package com.github.emreturgutce.protobuf;

import example.simple.Simple.SimpleMessage;

import java.io.FileOutputStream;
import java.util.Arrays;

public class SimpleMain {

    public static void main(String[] args) {

        final var builder = SimpleMessage.newBuilder();

        final var simple = builder.setId(1).setName("simple").setIsSimple(false).addAllSampleList(Arrays.asList(1, 2, 3)).build();

        try {
            FileOutputStream outputStream = new FileOutputStream("simple_message.bin");

            simple.writeTo(outputStream);

            outputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}