package org.dreambot.api;

import org.dreambot.api.methods.MethodContext;

public abstract class NodeBranch extends Node {

    /*
     * Left node, chosen when validation is successful
     */
    public abstract Node isTrue();

    /*
     * Right node, chosen when validation is not successful
     */
    public abstract Node isFalse();

    @Override
    public int onLoop(MethodContext context) {
        Node left = isTrue();
        Node right = isFalse();
        return validate(context) ? left.onLoop(context) : right.onLoop(context);
    }

}
