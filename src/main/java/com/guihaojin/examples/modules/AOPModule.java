package com.guihaojin.examples.modules;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import com.guihaojin.examples.MessageLogger;
import com.guihaojin.examples.MessageSentLoggable;

import java.util.regex.Matcher;

public class AOPModule extends AbstractModule {

    @Override
    protected void configure() {
        bindInterceptor(
            Matchers.any(),
            Matchers.annotatedWith(MessageSentLoggable.class),
            new MessageLogger());
    }
}
