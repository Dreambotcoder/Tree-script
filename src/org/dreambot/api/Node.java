package org.dreambot.api;

import org.dreambot.api.methods.MethodContext;

public abstract class Node {

    public abstract int onLoop(MethodContext context);
    public abstract boolean validate(MethodContext context);
}
