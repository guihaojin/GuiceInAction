package com.guihaojin.examples.modules;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import com.guihaojin.examples.MessageLogger;
import com.guihaojin.examples.MessageSentLoggable;

public class AoPModule extends AbstractModule {

    @Override
    protected void configure() {
        bindInterceptor(
            Matchers.any(),
            Matchers.annotatedWith(MessageSentLoggable.class),
            new MessageLogger());
    }
}
