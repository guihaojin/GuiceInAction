package com.guihaojin.examples;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guihaojin.examples.modules.AOPModule;
import com.guihaojin.examples.modules.FooModule;

public class GuiceTestMain {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(
            new FooModule(),
            new AOPModule()
        );

        System.out.println("Getting Foo object from injector.");
        Foo foo = injector.getInstance(Foo.class);
        foo.sayHello("guice");
        foo.sayBye();
    }
}
