package com.github.emreturgutce.protobuf;

import example.enumerations.Enumerations.DayOfWeek;
import example.enumerations.Enumerations.EnumMessage;

public class EnumMain {

    public static void main(String[] args) {

        EnumMessage.Builder builder = EnumMessage.newBuilder();

        EnumMessage message = builder.setId(345).setDayOfWeek(DayOfWeek.FRIDAY).build();

        System.out.println(message);
    }
}
