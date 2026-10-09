package com.getkeepsafe.relinker;

import java.util.Arrays;

/* loaded from: classes4.dex */
public class MissingLibraryException extends RuntimeException {
    public MissingLibraryException(String r3, String[] r4, String[] r5) {
        super("Could not find '" + r3 + "'. Looked for: " + Arrays.toString(r4) + ", but only found: " + Arrays.toString(r5) + ".");
    }
}
