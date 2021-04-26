package com.guihaojin.examples;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MessageLogger implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object[] objects = methodInvocation.getArguments();
        for (Object object : objects) {
            System.out.println("Sending message: " + object.toString());
        }
        return methodInvocation.proceed();
    }
}
