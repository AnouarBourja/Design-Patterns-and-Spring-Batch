package org.example;

import design.pattern.Phone;
import design.pattern.builder.PhoneBuilder;

public class App
{
    public static void main( String[] args )
    {
        PhoneBuilder builder1 = new PhoneBuilder();

        Phone phone1 = builder1.withBattery("Li-on").withCamera("camera-samsung").withScreenSize(16).build();

        // should we use a new builder for creating new Instance ???
        PhoneBuilder builder2 = new PhoneBuilder();

        Phone phone2 = builder2.withOs("Ericsson").withScreenSize(10).build();

        System.out.println(phone1.toString());

        System.out.println(phone2.toString());
    }
}
