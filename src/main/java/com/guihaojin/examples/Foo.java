package com.guihaojin.examples;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Foo {
    private final Bar bar;

    @Inject
    public Foo(Bar bar, @Named("coco") String coco) {
        this.bar = bar;
        System.out.println("Got coco: " + coco);
    }

    @MessageSentLoggable
    public void sayHello(String name) {
        System.out.println(name + ": Calling from Foo class.");
        this.bar.sayHi();
    }

    @MessageSentLoggable
    public void sayBye() {
        System.out.println("Foo say bye.");
    }
}
