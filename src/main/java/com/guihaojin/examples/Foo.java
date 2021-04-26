package com.guihaojin.examples;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.util.logging.Logger;

public class Foo {
    private final Bar bar;
    private final Logger logger;

    @Inject
    public Foo(Bar bar, @Named("coco") String coco, Logger logger) {
        this.bar = bar;
        System.out.println("Got coco: " + coco);
        this.logger = logger;
    }

    @MessageSentLoggable
    public void sayHello(String name) {
        System.out.println(name + ": Calling from Foo class.");
        this.bar.sayHi();
    }

    @MessageSentLoggable
    public void sayBye() {
        logger.info("logging from logger.");
        System.out.println("Foo say bye.");
    }
}
