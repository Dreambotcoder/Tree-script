package org.dreambot.script;

import org.dreambot.api.NodeBranch;
import org.dreambot.api.TreeScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.script.branches.RootBranch;

@ScriptManifest(category = Category.MISC, name = "Tree example", author = "Articron", version = 1.0D)
public class ScriptExample extends TreeScript {

    @Override
    public NodeBranch getRootBranch() {
        return new RootBranch();
    }
}
