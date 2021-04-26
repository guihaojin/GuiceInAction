package com.guihaojin.examples.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.guihaojin.examples.Bar;

public class FooModule extends AbstractModule {

    @Override
    protected void configure() {
    }

    @Provides
    @Singleton
    public Bar provideBar() {
        return new Bar();
    }

    @Provides
    @Named("coco")
    public String provideCoco() {
        return "COCO";
    }
}
